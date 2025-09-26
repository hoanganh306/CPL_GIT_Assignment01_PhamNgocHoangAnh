public class Calculator {
    public Double calculate(Double arg1, Double arg2) {
        if (arg2 == 0) throw new ArithmeticException("Divide by zero");
        return arg1 / arg2; // implement_divide
    }
}
