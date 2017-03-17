package Bank;

public class LoanAccount extends Account {

    public LoanAccount(String name, int owner, double balance, float montlyInterestRate, int count) {
        super(name, owner, balance, montlyInterestRate, count);
    }

    public void calculateInterestRate(int months) {
        int count = months;
        if (this.owner instanceof IndividualCustomer) {
            count -= 3;
            if (count < 1) {
                count = 0;
            }
        } else if (this.owner instanceof CompanyCustomer) {
            count -= 2;
            if (count < 1) {
                count = 0;
            }
        }
        System.out.println(this.balance * this.montlyInterestRate / 100 * count);
    }
}
