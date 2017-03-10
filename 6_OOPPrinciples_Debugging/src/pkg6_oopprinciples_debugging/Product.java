package pkg6_oopprinciples_debugging;

public class Product {

    String name;
    double price;

    public Product(String name, double price) {
        if (name.isEmpty()) {
            System.out.println("Name can’t be empty.");
            System.exit(0);
        } else {
            this.name = name;
        }
        if (price < 0) {
            System.out.println("Price can’t be negative.");
            System.exit(0);
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
