package pkg6_oopprinciples_debugging;

public class Person {

    String name;
    double balance;
    Product[] products = new Product[500];
    int productCount = 0;

    public Person(String name, double balance) {
        if (name.isEmpty()) {
            System.out.println("Name can’t be empty.");
            System.exit(0);
        } else {
            this.name = name;
        }
        if (balance < 0) {
            System.out.println("Balance can’t be negative.");
            System.exit(0);
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getProducts() {
        String productBuy = this.name + " - ";
        if (productCount != 0) {
            for (int i = 0; i < productCount; i++) {
                if (i != productCount - 1) {
                    productBuy += products[i].getName() + ", ";
                } else {
                    productBuy += products[i].getName();
                }
            }
        } else {
            productBuy += "Nothing bought";
        }
        return productBuy;
    }

    public void setBalance(double balance) {
        this.balance -= balance;
    }

    public void setProducts(String productName, double price) {
        products[productCount] = new Product(productName, price);
        productCount++;
    }

}
