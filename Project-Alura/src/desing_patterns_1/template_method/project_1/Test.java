package desing_patterns_1.template_method.project_1;

public class Test {

    public static void main(String[] args) {

        Budget budget = new Budget();
        budget.addItem(new Item(40.00, "Sunglasses"));
        budget.addItem(new Item(25.00, "Necklace"));
        budget.addItem(new Item(50.00, "Armani watch"));
        budget.addItem(new Item(5.00, "Black shirt"));

        TaxCalculator calculator = new TaxCalculator();
        calculator.calculate(budget, new IKVC());


    }

}
