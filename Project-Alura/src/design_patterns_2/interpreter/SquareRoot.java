package design_patterns_2.interpreter;

public class SquareRoot implements Expression {

    private final Expression number;

    public SquareRoot(Expression number) {
        this.number = number;
    }

    @Override
    public int result() {
        return (int) Math.sqrt(number.result());
    }
}
