package desing_patterns_1.chain_of_responsability.project_1;

public class NullDiscount implements Discount {

    @Override
    public double discount(Budget budget) {
        return 0;
    }

    @Override
    public void next(Discount discount) {

    }

}
