package object_orientation.project_1;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {

    public static void main(String[] args) {
        Debt debt = new Debt();
        debt.setCreditor("STAR Company");
        debt.setCreditorDocument(new CNPJ("00001-2143"));
        debt.setTotalValue(500);

        Payment payment = new Payment();
        payment.setPayer("RATS Company");
        payment.setPayerDocument(new CNPJ("00001-9789"));
        payment.setValue(270);

        debt.registerPayment(payment);

        DebtReport report = new DebtReport(debt);
        report.generateReport(NumberFormat.getCurrencyInstance(new Locale("pt", "BR")));
    }

}
