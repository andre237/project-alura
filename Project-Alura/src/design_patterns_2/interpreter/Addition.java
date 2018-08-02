package design_patterns_2.interpreter;

public class Addition implements Expression {

    private final Expression leftNumber, rightNumber;

    public Addition(Expression leftNumber, Expression rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    @Override
    public int result() {
        return leftNumber.result() + rightNumber.result();
    }
}
