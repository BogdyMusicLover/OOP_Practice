package org.example.prototype;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setId(1);
        invoice.setValue(120);
        invoice.setClient("VAB ANDREAS STYLE & BEAUTY S.R.L.");

        Bill bill = new Bill();
        bill.setId(1);
        bill.setValue(90);
        bill.setClient("SOFTWARE DEVELOPMENT ACADEMY");
        bill.setDueDate(new Date());

        System.out.println("Original object: ");
        invoice.print();
        bill.print();

        System.out.println("======================================================");
        System.out.println("CLONED OBJECTS");

        Invoice clonedInvoice = (Invoice) invoice.clone();
        Bill clonedBill = (Bill) bill.clone();

        clonedInvoice.print();
        clonedBill.print();
    }

}
