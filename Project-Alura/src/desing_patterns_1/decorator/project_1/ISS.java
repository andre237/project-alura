package desing_patterns_1.decorator.project_1;

public class ISS extends Tax {

    public ISS(Tax nextTax) {
        super(nextTax);
    }

    public ISS() {
        super();
    }

    @Override
    protected double calculateTax(Budget budget) {
        return (budget.getValue() * 0.1) + calculateNextTax(budget);
    }

    @Override
    public String toString() {
        return "ISS";
    }
}
