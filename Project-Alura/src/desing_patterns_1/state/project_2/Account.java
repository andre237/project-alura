package desing_patterns_1.state.project_2;

public class Account {

    protected double balance;
    protected AccountState state;

    public Account() {
        this.state = States.POSITIVE;
    }

    public double getBalance() {
        return balance;
    }

    public void cashIn(double value) {
        this.state.cashIn(this, value);
    }

    public void cashOut(double value) {
        this.state.cashOut(this, value);
    }
}
