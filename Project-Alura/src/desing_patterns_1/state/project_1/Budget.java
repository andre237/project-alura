package desing_patterns_1.state.project_1;

public class Budget {

    public double value;
    private BudgetState state;

    public Budget(double value) {
        this.value = value;
        this.state = States.ON_APPROVAL;
    }

    public BudgetState getState() {
        return state;
    }

    public void setState(BudgetState state) {
        this.state = state;
    }

    public void applyDiscount() {
        this.state.applyExtraDiscount(this);
    }

    public void approve() {
        this.state.approve(this);
    }

    public void disapprove() {
        this.state.disapprove(this);
    }

    public void close() {
        this.state.close(this);
    }
}
