package object_orientation.project_1;

public class Debt {

    private double totalValue;
    private String creditor;
    private Document creditorDocument;
    private Payments payments = new Payments();

    public Document getCreditorDocument() {
        return creditorDocument;
    }

    public void setCreditorDocument(Document creditorDocument) {
        this.creditorDocument = creditorDocument;
    }

    public Payments getPayments() {
        return payments;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public String getCreditor() {
        return creditor;
    }

    public void setCreditor(String creditor) {
        this.creditor = creditor;
    }

    public void registerPayment(Payment payment) {
        payments.registerPayment(payment);
    }

    public double getPaidValue() {
        return payments.getPaidValue();
    }

    public double valueToBePaid() {
        return this.totalValue - payments.getPaidValue();
    }
}
