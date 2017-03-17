package Bank;

public class MortgageAccount extends Account {

    public MortgageAccount(String name, int owner, double balance, float montlyInterestRate, int count) {
        super(name, owner, balance, montlyInterestRate, count);
    }

    /*
     * Мисля, че отговора е грешен в условието тъй като това е ипотечна сметкат и е на Юридическо лице. 
     * Което ще доведе до 50% лихва за първите 12 месеца и след това нормална. Ако съм разбрал условието правилно.
     * Отговора в задачата е за ипотечна сметка на физическо лице.
     */
    
    public void calculateInterestRate(int months) {
        double calculatedBalance = this.balance;
        int count = months;
        if (this.owner instanceof IndividualCustomer) {
            count -= 6;
            if (count < 1) {
                count = 0;
            }
        } else {
            count -= 12;
            if (count < 1) {
                count = 0;
            } else {
                calculatedBalance += calculatedBalance / 2;
            }
        }
        System.out.println((calculatedBalance * this.montlyInterestRate / 100 * count) + this.balance / 2);
    }
}
