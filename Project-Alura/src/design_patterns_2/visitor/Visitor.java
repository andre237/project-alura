package design_patterns_2.visitor;

public class Visitor {

    public void accept(Expression expression) {
        System.out.print("(");
        expression.getLeftNumber().accept(this);
        System.out.print(expression.symbol());
        expression.getRightNumber().accept(this);
        System.out.print(")");
    }

    public void acceptSquareRoot(SquareRoot squareRoot) {
        System.out.print("√");
        squareRoot.getNumber().accept(this);
    }

    public void acceptNumber(Number number) {
        System.out.print(number.result());
    }

}
