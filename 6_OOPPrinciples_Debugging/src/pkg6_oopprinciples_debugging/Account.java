
package pkg6_oopprinciples_debugging;


public class Account {
    
    String name;
    double govId;
    double balance;
    Credentials person;

    public Account(String name, double govId, double balance, Credentials person) {
        this.name = name;
        this.govId = govId;
        this.balance = balance;
        this.person = person;
    }
    
    
    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){
        balance-=amount;
    }
    double getBalance(){
        return balance;
    }
    boolean hasAccess(String password){
        return this.person.getPassword().equals(password);
    }
    String getUsername(){
        return this.person.getUsername();
    }
    double getGovId(){
        return this.govId;
    }
    String getName(){
        return this.name;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }
    
    public void setWithdraw(double balance) {
        this.balance -= balance;
    }

    public Credentials getPerson() {
        return person;
    }
}
