package object_orientation.project_1;

public class Payment {

    private String payer;
    private Document payerDocument;
    private double value;

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public Document getPayerDocument() {
        return payerDocument;
    }

    public void setPayerDocument(Document payerDocument) {
        this.payerDocument = payerDocument;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
