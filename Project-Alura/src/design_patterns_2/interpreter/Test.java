package design_patterns_2.interpreter;

public class Test {

    public static void main(String[] args) {

        Expression e1 = new Addition(new Number(5), new Number(6));
        Expression e2 = new Subtraction(new Number(15), new Number(7));

        Expression e3 = new Addition(new SquareRoot(new Number(25)), new Multiplication(e1, e2));

        System.out.println(e3.result());

    }

}
