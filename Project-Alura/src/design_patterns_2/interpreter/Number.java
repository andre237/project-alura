package design_patterns_2.interpreter;

public class Number implements Expression {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int result() {
        return number;
    }
}
