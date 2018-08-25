package design_patterns_2.visitor;

public class Test {

    public static void main(String[] args) {
        Expression e1 = new Addition(new Number(3), new Number(4));
        Expression e2 = new Division(new Number(10), new Number(5));
        Expression expression = new Multiplication(new SquareRoot(new Number(25)), new Subtraction(new Number(12), new Number(5)));

        Visitor visitor = new Visitor();
        expression.accept(visitor);

        System.out.println(" = " + expression.result());
    }

}
