package desing_patterns_1.builder.project_1;

import java.sql.Date;
import java.text.NumberFormat;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Test {

    public static void main(String[] args) {
        List<InvoiceItem> invoiceItems = Arrays.asList(new InvoiceItem("Wheel", 74.36), new InvoiceItem("Door", 23.97), new InvoiceItem("Engine", 1476.80));

        ElectronicInvoice invoice = new ElectronicInvoice.Builder().
                    from("Ford LTDA").
                    withCNPJ("0904396-654/1").
                    issuedAt(Date.from(Instant.now())).
                    withItems(invoiceItems).
                    withObservations("Some observation").
                    build();

        invoice.printDescription(NumberFormat.getCurrencyInstance(new Locale("pt", "br")));
    }

}
