package object_orientation.project_1;

import java.text.NumberFormat;

public class DebtReport {

    private final Debt debt;

    public DebtReport(Debt debt) {
        this.debt = debt;
    }

    public void generateReport(NumberFormat formatter) {
        System.out.println("Creditor document: " + debt.getCreditorDocument());
        System.out.println("Creditor name: " + debt.getCreditor());

        System.out.println("Debt value: " + formatter.format(debt.getTotalValue()));
        System.out.println("Paid value: " + formatter.format(debt.getPaidValue()));
        System.out.println("Remaining debt value: " + formatter.format(debt.valueToBePaid()));
    }
}
