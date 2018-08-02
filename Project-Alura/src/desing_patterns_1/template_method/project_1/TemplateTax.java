package desing_patterns_1.template_method.project_1;

public abstract class TemplateTax implements Tax {

    @Override
    public double calculateTax(Budget budget) {
        if (isMaximumTaxApplicable(budget)) {
            return maximumTax(budget);
        } else return minimumTax(budget);
    }

    protected abstract double maximumTax(Budget budget);

    protected abstract double minimumTax(Budget budget);

    protected abstract boolean isMaximumTaxApplicable(Budget budget);


}
