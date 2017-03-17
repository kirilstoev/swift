package Bank;

public class DepositAccount extends Account {

    public DepositAccount(String name, int owner, double balance, float montlyInterestRate, int count) {
        super(name, owner, balance, montlyInterestRate, count);
    }

    public void calculateInterestRate(int months) {
        System.out.println(this.balance * this.montlyInterestRate / 100 * months);
    }

}
