package design_patterns_2.memento;

import java.util.Date;

public class Contract {

    private Date date;
    private String client;
    protected ContractType type;

    public Contract(Date date, String client, ContractType type) {
        this.date = date;
        this.client = client;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public String getClient() {
        return client;
    }

    public String getType() {
        return type.name();
    }

    public void advance() {
        this.type.advance(this);
    }

    public State saveState() {
        return new State(new Contract(date, client, type));
    }

    public void restoreState(State state) {
        this.date = state.getContract().getDate();
        this.client = state.getContract().getClient();
        this.type = state.getContract().type;
    }
}
