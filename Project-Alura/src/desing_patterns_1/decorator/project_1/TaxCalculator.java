package desing_patterns_1.decorator.project_1;

public class TaxCalculator {

    public void calculate(Budget budget, Tax tax) {
        System.out.println(tax.toString() + " tax value: " + tax.calculateTax(budget));
    }

}
