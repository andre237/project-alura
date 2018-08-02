package desing_patterns_1.decorator.project_1;

public class Test {

    public static void main(String[] args) {
        Budget budget = new Budget(100.00);
        TaxCalculator calculator = new TaxCalculator();
        calculator.calculate(budget, new ICPP(new ISS()));
    }

}
