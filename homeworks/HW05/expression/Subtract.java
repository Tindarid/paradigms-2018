package expression;

public class Subtract extends Operation {
    public Subtract(AnyExpression first, AnyExpression second) {
        super(first, second);
    }

    public double calc(double a, double b) {
        return a - b;
    }

    public int calc(int a, int b) {
        return a - b;
    }
}
