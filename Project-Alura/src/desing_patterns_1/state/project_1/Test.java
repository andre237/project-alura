package desing_patterns_1.state.project_1;

public class Test {

    public static void main(String[] args) {
        Budget budget = new Budget(500.00);
        budget.applyDiscount();
        System.out.println(budget.value);

        budget.approve();
        budget.applyDiscount();
        System.out.println(budget.value);
    }

}
