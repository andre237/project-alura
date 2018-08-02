package design_patterns_2.visitor;

public class Number implements Expression {

    private final double number;

    public Number(double number) {
        this.number = number;
    }

    @Override
    public double result() {
        return number;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.acceptNumber(this);
    }

    @Override
    public String symbol() {
        return String.valueOf(this.number);
    }

    @Override
    public Expression getLeftNumber() {
        return null;
    }

    @Override
    public Expression getRightNumber() {
        return null;
    }
}
