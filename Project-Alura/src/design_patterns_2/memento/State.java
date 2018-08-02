package design_patterns_2.memento;

public class State {

    private final Contract contract;

    public State(Contract contract) {
        this.contract = contract;
    }

    public Contract getContract() {
        return contract;
    }
}
