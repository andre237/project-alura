package desing_patterns_1.observer.project_1;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Test {

    public static void main(String[] args) {
        List<InvoiceItem> invoiceItems = Arrays.asList(new InvoiceItem("Wheel", 74.36), new InvoiceItem("Door", 23.97), new InvoiceItem("Engine", 1476.80));
        List<InvoiceAction> actions = Arrays.asList(Actions.values());

        ElectronicInvoice invoice = new ElectronicInvoice.Builder(actions).
                    from("Ford LTDA").
                    withCNPJ("0904396-654/1").
                    issuedNow().
                    withItems(invoiceItems).
                    withObservations("Any observation").
                    build();

        invoice.printDescription(NumberFormat.getCurrencyInstance(new Locale("pt", "BR")));
    }

}
