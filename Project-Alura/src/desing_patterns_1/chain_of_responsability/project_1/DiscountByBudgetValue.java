package desing_patterns_1.chain_of_responsability.project_1;

public class DiscountByBudgetValue implements Discount {

    private Discount nextDiscount;

    @Override
    public double discount(Budget budget) {
        if (budget.getValue() > 100) {
            return budget.getValue() * 0.15;
        } else return nextDiscount.discount(budget);
    }

    @Override
    public void next(Discount discount) {
        this.nextDiscount = discount;
    }
}
