package week1_Natalia;

public class Divide {
    public static void main(String[] args) {
        int quotient= DivideWithout(15,3);
        System.out.println("quotient = " + quotient);
    }

    public static int DivideWithout(int dividend, int divisor) {
        if (divisor <= 0 || dividend<0 ) {
            throw new ArithmeticException("This method can be used only for numbers bigger than zero");
        }
        int result = 0;

//        while (dividend >= divisor) {
//            dividend -= divisor;
//            result++;
//        }
            for (int i = dividend; i >= divisor; i -= divisor) {
                result++;
            }
            return result;
    }
}
