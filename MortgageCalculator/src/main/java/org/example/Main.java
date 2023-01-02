package org.example;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount: ");
        try {
            Integer amount = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The amount is mandatory to be numeric");
            return;
        }

        System.out.println("Please enter the loan period in months: ");
        try {
            Integer period = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The period is mandatory to be numeric");
            return;
        }

        System.out.println("Please insert the annual interest rate: ");
        try {
            Double interestRate = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The interest rate is mandatory to be numeric");
            return;
        }



    }
}