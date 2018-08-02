package design_patterns_2.visitor;

public interface Expression {

    double result();
    void accept(Visitor visitor);
    String symbol();
    Expression getLeftNumber();
    Expression getRightNumber();

}
