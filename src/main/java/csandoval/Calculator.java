package csandoval;

public class Calculator {
    public static double sum(double op1, double op2) {
        return op1 + op2;
    }

    public static double sub(double op1, double op2) {
        return op1 - op2;
    }
  
    public static double mul(double op1, double op2) {
        return op1 * op2;
    }

    public static double div(double op1, double op2) throws ArithmeticException {
        if (op2 == 0.0)
            throw new ArithmeticException("Div by zero error!");
        return op1 / op2;
    }
}