package org.example.package2;

import org.example.package1.Class1;

import static org.example.package1.Class1.*;

public class Class2 {
    public static void main(String[] args) {

        Class1 class1 = new Class1();

        System.out.println("Static import: " + Y);
        class1.setX(Y + 2);
        System.out.println("Value of X after increment with static value:" + class1.getX());
        class1.testMethod();


    }

}
