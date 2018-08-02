package desing_patterns_1.chain_of_responsability.project_2;

public class Account {

    private final String owner;
    private final double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}
