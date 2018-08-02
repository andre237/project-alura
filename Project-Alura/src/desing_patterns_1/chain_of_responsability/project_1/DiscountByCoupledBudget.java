package desing_patterns_1.chain_of_responsability.project_1;

public class DiscountByCoupledBudget implements Discount {

    private Discount nextDiscount;

    @Override
    public double discount(Budget budget) {
        if (budget.contains("Fry pan") && budget.contains("Screwdriver")) {
            return budget.getValue() * 0.1;
        } else return nextDiscount.discount(budget);
    }

    @Override
    public void next(Discount discount) {
        this.nextDiscount = discount;
    }


}
