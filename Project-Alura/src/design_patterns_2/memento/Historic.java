package design_patterns_2.memento;

import java.util.ArrayList;
import java.util.List;

public class Historic {

    private List<State> savedStates = new ArrayList<>();

    public void add(State state) {
        this.savedStates.add(state);
    }

    public State get(int index) {
        return savedStates.get(index);
    }

}
