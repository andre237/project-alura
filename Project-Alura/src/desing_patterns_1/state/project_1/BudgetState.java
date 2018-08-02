package desing_patterns_1.state.project_1;

public interface BudgetState {

    void applyExtraDiscount(Budget budget);
    void approve(Budget budget);
    void disapprove(Budget budget);
    void close(Budget budget);

}
