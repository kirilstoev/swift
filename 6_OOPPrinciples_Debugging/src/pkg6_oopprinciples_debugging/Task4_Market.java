package pkg6_oopprinciples_debugging;

import java.util.Scanner;

public class Task4_Market {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doWhile = "";
        String[] newRow;
        int rowCount = 0;
        int productsCount =0;
        int personsCount =0;
        Product[] products = new Product[500];
        Person[] persons = new Person[200];
        do {
            String row = sc.nextLine();
            doWhile = row;
            if (!row.equals("END")) {
                if (rowCount == 0) {
                    newRow = row.split(";");
                    for (int j = 0; j < newRow.length; j++) {
                        String[] splitRow = newRow[j].split("=");
                        persons[j] = new Person(splitRow[0], Double.parseDouble(splitRow[1]));
                        personsCount++;
                    }
                    rowCount++;
                } else if (rowCount == 1) {
                    newRow = row.split(";");
                    for (int j = 0; j < newRow.length; j++) {
                        String[] splitRow = newRow[j].split("=");
                        products[j] = new Product(splitRow[0], Double.parseDouble(splitRow[1]));
                        productsCount++;
                    }
                    rowCount++;
                } else {
                    newRow = row.split(" ");
                    for (int j = 0; j < personsCount; j++) {
                        if (newRow.length == 2) {
                            if (newRow[0].equals(persons[j].getName())) {
                                String status = newRow[0] + " can’t afford " + newRow[1];
                                for (int k = 0; k < productsCount; k++) {
                                    if (newRow[1].equals(products[k].getName()) && persons[j].getBalance() >= products[k].getPrice()) {
                                        persons[j].setBalance(products[k].getPrice());
                                        persons[j].setProducts(products[k].getName(), products[k].getPrice());
                                        status = newRow[0] + " bought " + newRow[1];
                                        j = personsCount;
                                        break;
                                    } 
                                }
                                System.out.println(status);
                            }
                        } else {
                            if ((newRow[0]+" "+newRow[1]).equals(persons[j].getName())) {
                                String status=newRow[0]+" "+newRow[1] + " can’t afford " + newRow[2];
                                for (int k = 0; k < productsCount; k++) {
                                    if (newRow[2].equals(products[k].getName()) && persons[j].getBalance() >= products[k].getPrice()) {
                                        persons[j].setBalance(products[k].getPrice());
                                        persons[j].setProducts(products[k].getName(), products[k].getPrice());
                                        status = newRow[0]+" "+newRow[1] + " bought " + newRow[2];
                                        j = personsCount;
                                        break;
                                    } 
                                }
                                System.out.println(status);
                            }
                        }
                    }
                    rowCount++;
                }
            } else {
                for (int i =0; i<personsCount; i++) {
                    System.out.println(persons[i].getProducts());
                }
            }
        } while (!doWhile.equals("END"));
    }
}
