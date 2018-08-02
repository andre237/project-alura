package design_patterns_2.visitor;

public class SquareRoot implements Expression {

     private final Expression number;

    public SquareRoot(Expression number) {
        this.number = number;
    }

    @Override
    public double result() {
        return Math.sqrt(number.result());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.acceptSquareRoot(this);
    }

    @Override
    public String symbol() {
        return "√";
    }

    @Override
    public Expression getLeftNumber() {
        return null;
    }

    @Override
    public Expression getRightNumber() {
        return null;
    }

    public Expression getNumber() {
        return number;
    }
}
