package com.tm3.main;

import java.util.Scanner;

import com.tm3.bean.FDAccount;
import com.tm3.bean.RDAccount;
import com.tm3.bean.SBAccount;

public class InterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.print("\n1. Interest Calculator - SB: ");
            System.out.print("\n2. Interest Calculator - FD: ");
            System.out.print("\n3. Interest Calculator - RD: ");
            System.out.print("\n4. Exit");
            System.out.print("\nEnter your option (1..4): ");

            choice  = sc.hasNextInt() ? sc.nextInt() : 0;

            switch (choice) {
            case 1:
                SBAccount sbAccount = new SBAccount();
                System.out.print("\nEnter the Average amount in your account: ");
                sbAccount.setAmount(sc.nextDouble());
                System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
                break;

            case 2:
                FDAccount fdAccount = new FDAccount();
                System.out.print("\nEnter the FD ammount: ");
                fdAccount.setAmount(sc.nextDouble());

                System.out.print("\nEnter number of days: ");
                int noOfDays = sc.nextInt();
                while (noOfDays < 0) {
                    System.out.println("Invalid Number of days. Please enter non - negative values.");
                    System.out.print("\nEnter number of days: ");
                    noOfDays = sc.nextInt();
                }
                fdAccount.setNoOfDays(noOfDays);

                System.out.print("\nEnter your age: ");
                int age = sc.nextInt();
                while (age < 0) {
                    System.out.println("Invalid age. Please enter non - negative values.");
                    System.out.print("\nEnter your age: ");
                    age = sc.nextInt();
                }
                fdAccount.setAgeOfACHolder(age);

                System.out.println("Interest gained: Rs. " + fdAccount.calculateInterest());
                break;

            case 3:
                RDAccount rdAccount = new RDAccount();
                System.out.print("\nEnter the RD ammount: ");
                rdAccount.setAmount(sc.nextDouble());

                System.out.print("\nEnter number of months: ");
                int noOfMonths = sc.nextInt();
                while (noOfMonths < 0) {
                    System.out.println("Invalid Number of months. Please enter non - negative values.");
                    System.out.print("\nEnter number of months: ");
                    noOfMonths = sc.nextInt();
                }
                rdAccount.setNoOfMonth(noOfMonths);

                System.out.print("\nEnter your age: ");
                age = sc.nextInt();
                while (age < 0) {
                    System.out.println("Invalid age. Please enter non - negative values.");
                    System.out.print("\nEnter your age: ");
                    age = sc.nextInt();
                }
                rdAccount.setAgeOfACHolder(age);

                System.out.println("Interest gained: Rs. " + rdAccount.calculateInterest());
                break;

            case 4:
                System.out.println("Thanks for using Interest Calculator.");
                break;

            default:
                break;
            }

        } while (choice != 4);

        sc.close();
    }

}
