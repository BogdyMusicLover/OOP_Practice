package org.example.conditionalstatement;
//Given an integer, perform the following conditional actions:
//        If N is odd, print Weird
//        If N is even and in the inclusive range of 2 to 5 print Not Weird
//        If N is even and in the inclusive range of 6 to 20 print Weird
//        If N is even and greater than 20 print Not Weird
//
//        Complete the stub code provided in your editor to print whether or not N is weird.
// ODD - IMPAR
// EVEN - PAR

import java.util.Scanner;

public class IfElseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number:");
        int N = Integer.parseInt(scanner.nextLine());
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N<5) {
            System.out.println("Not Weird");
        } else if (N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

    }
}
