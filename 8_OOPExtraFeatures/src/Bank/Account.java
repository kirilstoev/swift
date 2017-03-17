package Bank;

public class Account {

    int IBAN;
    Customer owner;
    double balance;
    float montlyInterestRate;
    int months;

    public Account(String name, int owner, double balance, float montlyInterestRate, int count) {
        this.IBAN = ++count;
        if (owner == 1) {
            this.owner = new IndividualCustomer(name);
        } else {
            this.owner = new CompanyCustomer(name);
        }
        this.balance = balance;
        this.montlyInterestRate = montlyInterestRate;
        System.out.println(String.format("%08d", IBAN));
    }

    public double getBalance() {
        return balance;
    }

    public float getMontlyInterestRate() {
        return montlyInterestRate;
    }

    public Customer getOwner() {
        return owner;
    }

    public String getIBAN() {
        return String.format("%08d", IBAN);
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

}
