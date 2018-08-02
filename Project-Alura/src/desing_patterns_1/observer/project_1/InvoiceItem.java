package desing_patterns_1.observer.project_1;

import java.text.NumberFormat;

public class InvoiceItem {

    private final String name;
    private final double value;

    public InvoiceItem(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String toString(NumberFormat formatter) {
        return "        Name: " + this.name +
                "\n        Value: " + formatter.format(this.value) + "\n        ----------------";
    }
}
