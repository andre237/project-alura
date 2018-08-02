package desing_patterns_1.template_method.project_1;

public class IKVC extends TemplateTax {

    @Override
    public double maximumTax(Budget budget) {
        return budget.getValue() * 0.2;
    }

    @Override
    public double minimumTax(Budget budget) {
        return budget.getValue() * 0.18;
    }

    @Override
    public boolean isMaximumTaxApplicable(Budget budget) {
        return budget.getValue() > 100 && budget.getItemsAmount() > 3;
    }

    @Override
    public String toString() {
        return "IKVC";
    }
}
