package pkg6_oopprinciples_debugging;

public class Bank {

    Account[] accounts = new Account[5];
    int openAccounts = 0;
    String status = "";

    String openAccount(String username, String password, String name, double govId) {
        if (openAccounts <= 5) {
            status = "OPEN failure";
            for (int i = 0; i < 5; i++) {
                if (accounts[i] == null) {
                    accounts[i] = new Account(name, govId, 0, new Credentials(username, password));
                    openAccounts++;
                    status = "OPEN success";
                    i = 5;
                    return status;
                }
            }
            return status;
        } else {
            status = "OPEN failure";
            return status;
        }
    }

    String closeAccount(String username, String password) {
        if (openAccounts <= 0) {
            status = "CLOSE failure";
            return status;
        } else {
            status = "CLOSE failure";
            for (int i = 0; i < 5; i++) {
                if (accounts[i] != null) {
                    if (accounts[i].getPerson().getUsername().equals(username) && accounts[i].getPerson().getPassword().equals(password)) {
                        accounts[i] = null;
                        status = "CLOSE success";
                        openAccounts--;
                    }
                }
            }
            return status;
        }
    }

    String deposit(String username, double amount) {
        status = "DEPOSIT fail";
        if (amount > 0) {
            for (int i = 0; i < 5; i++) {
                if (accounts[i] != null) {
                    if (accounts[i].getPerson().getUsername().equals(username)) {
                        accounts[i].setBalance(amount);
                        status = "DEPOSIT success";
                    }
                }
            }
        }
        return status;
    }

    String withdraw(String username, String password, double amount) {
        status = "WITHDRAW fail";
        for (int i = 0; i < 5; i++) {
            if (accounts[i] != null) {
                if (accounts[i].getPerson().getUsername().equals(username) && accounts[i].getPerson().getPassword().equals(password) && accounts[i].getBalance() > amount) {
                    accounts[i].setWithdraw(amount);
                    status = "WITHDRAW success";
                }
            }
        }
        return status;
    }

    String transfer(String username, String password, double amount, String recipient) {
        status = "TRANSFER fail";
        for (int i = 0; i < 5; i++) {
            if (accounts[i] != null) {
                if (accounts[i].getPerson().getUsername().equals(username) && accounts[i].getPerson().getPassword().equals(password) && accounts[i].getBalance() > amount) {
                    accounts[i].setWithdraw(amount);
                    for (int j = 0; j < 5; j++) {
                        if (accounts[j] != null) {
                            if (accounts[j].getPerson().getUsername().equals(recipient)) {
                                accounts[j].setBalance(amount);
                                status = "TRANSFER success";
                            }
                        }
                    }
                }
            }
        }
        return status;
    }

    double getAssets() {
        double assets = 0;
        for (int i = 0; i < 5; i++) {
            if (accounts[i] != null) {
                assets += accounts[i].getBalance();
            }
        }
        return assets;
    }

    void printAccounts() {
        for (int i = 0; i < 5; i++) {
            if (accounts[i] != null) {
                System.out.println(accounts[i].getName() + ", " + accounts[i].getGovId() + ", " + accounts[i].getBalance());
            }
        }
    }
}
