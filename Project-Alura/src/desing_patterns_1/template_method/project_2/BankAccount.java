package desing_patterns_1.template_method.project_2;

public class BankAccount {

    private final String owner, accountID;
    private final double balance;

    public BankAccount(String owner, String accountID, double balance) {
        this.owner = owner;
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }
}
