package desing_patterns_1.strategy;

public class Test {

    public static void main(String[] args) {
        Budget budget = new Budget(500);
        TaxCalculator calculator = new TaxCalculator();

        calculator.calculate(budget, Taxes.IPVA);
    }

}
