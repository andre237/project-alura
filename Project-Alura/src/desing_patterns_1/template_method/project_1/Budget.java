package desing_patterns_1.template_method.project_1;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private double value;
    private List<Item> items = new ArrayList<>();

    public double getValue() {
        return value;
    }

    public void addItem(Item item) {
        items.add(item);
        value += item.getValue();
    }

    public int getItemsAmount() {
        return items.size();
    }
}
