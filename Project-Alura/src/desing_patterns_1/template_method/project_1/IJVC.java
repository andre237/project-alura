package desing_patterns_1.template_method.project_1;

public class IJVC extends TemplateTax {

    @Override
    public double maximumTax(Budget budget) {
        return budget.getValue() * 0.15;
    }

    @Override
    public double minimumTax(Budget budget) {
        return budget.getValue() * 0.08;
    }

    @Override
    public boolean isMaximumTaxApplicable(Budget budget) {
        return budget.getValue() > 100;
    }

    @Override
    public String toString() {
        return "IJVC";
    }
}
