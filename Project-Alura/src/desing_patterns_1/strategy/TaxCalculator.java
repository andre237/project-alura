package desing_patterns_1.strategy;

public class TaxCalculator {

    public void calculate(Budget budget, Tax tax) {
        System.out.println(tax.name() + " tax value: " + tax.calculateTax(budget));
    }

}
