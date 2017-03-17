package Bank;

import java.util.Scanner;

public class Task2_Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accounts = new Account[100];
        int count = 0;
        String doWhile = " ";
        do {
            String readRow = sc.nextLine();
            String[] splitRow = readRow.split(" ");
            doWhile = splitRow[0];
            if (splitRow[0].equals("OPEN")) {
                switch (splitRow[3]) {
                    case "1":
                        accounts[count] = new DepositAccount(splitRow[1], Integer.parseInt(splitRow[2]), Double.parseDouble(splitRow[4]), Float.parseFloat(splitRow[5]), count);
                        count++;
                        break;
                    case "2":
                        accounts[count] = new LoanAccount(splitRow[1], Integer.parseInt(splitRow[2]), Double.parseDouble(splitRow[4]), Float.parseFloat(splitRow[5]), count);
                        count++;
                        break;
                    case "3":
                        accounts[count] = new MortgageAccount(splitRow[1], Integer.parseInt(splitRow[2]), Double.parseDouble(splitRow[4]), Float.parseFloat(splitRow[5]), count);
                        count++;
                        break;
                    default:
                        break;
                }
            } else if (splitRow[0].equals("PUT")) {
                for (int j = 0; j < count; j++) {
                    if (accounts[j].getOwner().name.equals(splitRow[1]) || accounts[j].getIBAN().equals(splitRow[1])) {
                        accounts[j].setBalance(Double.parseDouble(splitRow[2]));
                        break;
                    }
                }
            } else if (splitRow[0].equals("GET")) {
                for (int j = 0; j < count; j++) {
                    if (accounts[j] instanceof DepositAccount) {
                        if (accounts[j].getOwner().name.equals(splitRow[1]) || accounts[j].getIBAN().equals(splitRow[1])) {
                            accounts[j].setBalance(-Double.parseDouble(splitRow[2]));
                            break;
                        }
                    }
                }
            } else if (splitRow[0].equals("INFO")) {
                for (int j = 0; j < count; j++) {
                    if (accounts[j].getOwner().name.equals(splitRow[1]) || accounts[j].getIBAN().equals(splitRow[1])) {
                        if (accounts[j] instanceof DepositAccount) {
                            DepositAccount deposit = (DepositAccount) accounts[j];
                            deposit.calculateInterestRate(Integer.parseInt(splitRow[2]));
                            break;
                        } else if (accounts[j] instanceof LoanAccount) {
                            LoanAccount loan = (LoanAccount) accounts[j];
                            loan.calculateInterestRate(Integer.parseInt(splitRow[2]));
                            break;
                        } else if (accounts[j] instanceof MortgageAccount) {
                            MortgageAccount mortgage = (MortgageAccount) accounts[j];
                            mortgage.calculateInterestRate(Integer.parseInt(splitRow[2]));
                            break;
                        }
                    }
                }
            }
        } while (!doWhile.equals("END"));
    }
}
