package desing_patterns_1.chain_of_responsability.project_1;

public class DiscountCalculator {

    public double discount(Budget budget) {

        Discount d1 = new DiscountByBudgetValue();
        Discount d2 = new DiscountByItemNumber();
        Discount d3 = new DiscountByCoupledBudget();
        Discount d4 = new NullDiscount();

        d1.next(d2);
        d2.next(d3);
        d3.next(d4);

        return d1.discount(budget);
    }

}
