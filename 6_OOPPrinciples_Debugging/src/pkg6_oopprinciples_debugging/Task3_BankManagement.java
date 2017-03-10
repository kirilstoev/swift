package pkg6_oopprinciples_debugging;

import java.util.Scanner;

public class Task3_BankManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doWhile = "";
        Bank bank = new Bank();
        do {
            String row = sc.nextLine();
            String[] newRow = row.split(" ");
            doWhile = newRow[0];
            if (!newRow[0].equals("END")) {
                switch (newRow[0]) {
                    case "OPEN":
                        System.out.println(bank.openAccount(newRow[1], newRow[2], newRow[3], Double.parseDouble(newRow[4])));
                        break;
                    case "CLOSE":
                        System.out.println(bank.closeAccount(newRow[1], newRow[2]));
                        break;
                    case "DEPOSIT":
                        System.out.println(bank.deposit(newRow[1], Double.parseDouble(newRow[2])));
                        break;
                    case "WITHDRAW":
                        System.out.println(bank.withdraw(newRow[1], newRow[2], Double.parseDouble(newRow[3])));
                        break;
                    case "TRANSFER":
                        System.out.println(bank.transfer(newRow[1], newRow[2], Integer.parseInt(newRow[3]), newRow[4]));
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println(bank.getAssets());
                bank.printAccounts();
            }
        } while (!doWhile.equals("END"));
    }
}
