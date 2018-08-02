package design_patterns_2.visitor;

public class Addition implements Expression {

    private final Expression leftNumber, rightNumber;

    public Addition(Expression leftNumber, Expression rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    @Override
    public double result() {
        return leftNumber.result() + rightNumber.result();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.accept(this);
    }

    @Override
    public String symbol() {
        return " + ";
    }

    public Expression getLeftNumber() {
        return leftNumber;
    }

    public Expression getRightNumber() {
        return rightNumber;
    }
}
