package desing_patterns_1.decorator.project_1;

public class ICMS extends Tax {

    public ICMS(Tax nextTax) {
        super(nextTax);
    }

    public ICMS() {
        super();
    }

    @Override
    protected double calculateTax(Budget budget) {
        return (budget.getValue() * 0.16) + calculateNextTax(budget);
    }

    @Override
    public String toString() {
        return "ICMS";
    }
}
