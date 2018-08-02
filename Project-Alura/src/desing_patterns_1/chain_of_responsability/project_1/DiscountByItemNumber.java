package desing_patterns_1.chain_of_responsability.project_1;

public class DiscountByItemNumber implements Discount {

    private Discount nextDiscount;

    @Override
    public double discount(Budget budget) {
        if (budget.itemsNumber() > 5) {
            return budget.getValue() * 0.2;
        } else return nextDiscount.discount(budget);
    }

    @Override
    public void next(Discount discount) {
        this.nextDiscount = discount;
    }

}
