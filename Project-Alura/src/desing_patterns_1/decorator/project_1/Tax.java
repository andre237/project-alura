package desing_patterns_1.decorator.project_1;

public abstract class Tax {

    protected final Tax nextTax;

    public Tax(Tax nextTax) {
        this.nextTax = nextTax;
    }

    public Tax() {
        this.nextTax = null;
    }

    protected double calculateNextTax(Budget budget) {
        return this.nextTax != null ? nextTax.calculateTax(budget) : 0;
    }

    protected abstract double calculateTax(Budget budget);

}
