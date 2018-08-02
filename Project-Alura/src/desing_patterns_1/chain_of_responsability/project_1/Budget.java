package desing_patterns_1.chain_of_responsability.project_1;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private double value;
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
        this.value += item.getValue();
    }

    public double getValue() {
        return value;
    }

    public int itemsNumber() {
        return items.size();
    }

    public boolean contains(String itemDescription) {
        return this.items.stream().anyMatch(item -> item.getDescription().equals(itemDescription));
    }
}
