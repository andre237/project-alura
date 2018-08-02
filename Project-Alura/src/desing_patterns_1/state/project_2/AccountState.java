package desing_patterns_1.state.project_2;

public interface AccountState {

    void cashIn(Account account, double value);
    void cashOut(Account account, double value);

}
