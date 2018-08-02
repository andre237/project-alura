package desing_patterns_1.template_method.project_1;

public class Item {

    private final double value;
    private final String description;

    public Item(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
