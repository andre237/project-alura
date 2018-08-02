package solid.project_2;

import java.util.List;

public class InvoiceGenerator {

    private final List<Actions> actions;

    public InvoiceGenerator(List<Actions> actions) {
        this.actions = actions;
    }

    public ElectronicInvoice generate(Budget budget) {
        ElectronicInvoice invoice = new ElectronicInvoice(budget.getValue(), this.simpleTaxTo(budget));
        actions.forEach(action -> action.execute(invoice));
        return invoice;
    }

    private double simpleTaxTo(Budget budget) {
        return budget.getValue() * 0.06;
    }
}
