package desing_patterns_1.chain_of_responsability.project_1;

public class Test {

    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new Item(15.00, "Fry pan"));
        budget.addItem(new Item(30.00, "Bluetooth earphone"));
        budget.addItem(new Item(5.00, "Leather watch"));
        budget.addItem(new Item(20.00, "Screwdriver"));

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Value of the discount: " + calculator.discount(budget));
    }

}
