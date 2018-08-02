package solid.project_2;

public class ElectronicInvoice {

    private double value;
    private double taxes;

    public ElectronicInvoice(double value, double taxes) {
        this.value = value;
        this.taxes = taxes;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }
}
