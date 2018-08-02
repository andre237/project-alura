package solid.project_3;

public class StandardPriceTable implements PriceTable {

    @Override
    public double discountTo(double value) {
        return value > 500 ? 0.08 : 0;
    }
}
