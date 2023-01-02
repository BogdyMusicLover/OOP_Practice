package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static final int MONTHS_IN_YEAR = 12;
    static final int PERCENT = 100;

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        CsvWriter csvWriter = null;

        try {
            FileWriter writer = new FileWriter(FileProvider.getFile());
            csvWriter = new CsvWriter(writer);
            csvWriter.writeHeader();

        } catch (IOException e) {
            System.out.println("Some error occurred when initializing the CsvWriter: " + e.getMessage());
            return;
        }

        int amount;
        int period;
        double interestRate;

        System.out.println("Please enter the amount: ");
        try {
            amount = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The amount is mandatory to be numeric");
            return;
        }

        System.out.println("Please enter the loan period in years: ");
        try {
            period = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The period is mandatory to be numeric");
            return;
        }

        System.out.println("Please insert the annual interest rate: ");
        try {
            interestRate = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The interest rate is mandatory to be numeric");
            return;
        }

        double balance = amount;
        for (int month = 1; month <= period * MONTHS_IN_YEAR; month++) {
            double lastMonthBalance = balance;
            double monthlyMortgage = calculateMortgage(amount, period, interestRate);
            double monthlyInterest = calculateInterest(lastMonthBalance, interestRate);
            double paidAmount = monthlyMortgage - monthlyInterest;

            balance = (lastMonthBalance - paidAmount) < 0 ? 0 : (lastMonthBalance - paidAmount);

            System.out.println("Month: " + month + " | "
                    + " Mortgage: " + monthlyMortgage + " | "
                    + " Interest: " + monthlyInterest + " | "
                    + " Paid Amount: " + paidAmount
                    + " Balance: " + balance);

            try {
                assert csvWriter != null;
                csvWriter.writeRecord(month, monthlyMortgage, balance, monthlyInterest, paidAmount);
            } catch (IOException e) {
                System.out.println("Error while writing the csv file: " + e.getMessage());
            }

        }
        try {
            assert csvWriter != null;
            csvWriter.closeFile();
        } catch (IOException e ){
            System.out.println("Something went wrong when trying to close the csv file: " + e.getMessage());
        }

    }

    // calcul rata lunara
    private static double calculateMortgage(Integer amount, Integer period, Double interestRate) {
        double monthlyRate = interestRate / PERCENT / MONTHS_IN_YEAR;
        return (monthlyRate * amount) / (1 - Math.pow(1 + monthlyRate, (-period * MONTHS_IN_YEAR)));
    }

    // calcul dobanda pe o luna
    private static double calculateInterest(double balance, double interestRate) {
        double interestPerYear = balance * interestRate / PERCENT;
        return interestPerYear / MONTHS_IN_YEAR;
    }
}