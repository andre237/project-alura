package desing_patterns_1.strategy;

public interface Tax {

    double calculateTax(Budget budget);
    String name();

}
