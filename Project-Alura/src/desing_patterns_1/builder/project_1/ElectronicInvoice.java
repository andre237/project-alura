package desing_patterns_1.builder.project_1;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public class ElectronicInvoice {

    private String socialName;
    private String cnpj;
    private Date dateOfIssue;
    private double bruteValue;
    private double taxes;
    private List<InvoiceItem> invoiceItems;
    private String observations;

    public ElectronicInvoice(Builder builder) {
        this.socialName = builder.socialName;
        this.cnpj = builder.cnpj;
        this.dateOfIssue = builder.dateOfIssue;
        this.bruteValue = builder.bruteValue;
        this.taxes = builder.taxes;
        this.invoiceItems = builder.invoiceItems;
        this.observations = builder.observations;
    }

    public void printDescription(NumberFormat formatter) {
        System.out.println("Invoice description:" +
                "\n    Social name: " + this.socialName +
                "\n    CNPJ: " + this.cnpj +
                "\n    Date of Issue: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dateOfIssue) +
                "\n    Brute value: " + formatter.format(this.bruteValue) +
                "\n    Taxes value: " + formatter.format(this.taxes) +
                "\n    Items: ");
        invoiceItems.stream().map(item -> item.toString(formatter)).forEach(System.out::println);
        System.out.println("    Observations: " + this.observations);
    }

    public static class Builder {

        private String socialName, cnpj, observations;
        private double bruteValue, taxes;
        private List<InvoiceItem> invoiceItems;
        private Date dateOfIssue;

        public Builder() {
            this.dateOfIssue = Date.from(Instant.now());
        }

        public Builder from(String socialName) {
            this.socialName = socialName;
            return this;
        }

        public Builder withCNPJ(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder issuedAt(Date date) {
            this.dateOfIssue = date;
            return this;
        }

        public Builder withItems(List<InvoiceItem> items) {
            this.invoiceItems = items;

            items.forEach(item -> {
                this.bruteValue += item.getValue();
                this.taxes += item.getValue() * 0.07;
            });

            return this;
        }

        public Builder withObservations(String observations) {
            this.observations = observations;
            return this;
        }

        public ElectronicInvoice build() {
            return new ElectronicInvoice(this);
        }
    }

}
