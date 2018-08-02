package desing_patterns_1.builder.project_1;

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

    public String toString(NumberFormat format) {
        return "        Name: " + this.name +
                "\n        Value: " + format.format(this.value) + "\n        ----------------";
    }
}
