package desing_patterns_1.decorator.project_1;

public class ICPP extends Tax {

    public ICPP(Tax nextTax) {
        super(nextTax);
    }

    public ICPP() {
        super();
    }

    @Override
    protected double calculateTax(Budget budget) {
        return (budget.getValue() * 0.25) + calculateNextTax(budget);
    }

    @Override
    public String toString() {
        return "ICPP";
    }
}
