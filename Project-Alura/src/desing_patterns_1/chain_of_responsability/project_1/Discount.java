package desing_patterns_1.chain_of_responsability.project_1;

public interface Discount {

    double discount(Budget budget);
    void next(Discount discount);

}
