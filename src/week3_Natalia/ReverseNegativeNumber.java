package week3_Natalia;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println("reverseNumber(-123) = " + reverseNumber(-123));

    }

    public static int reverseNumber(int negativeNum) {
        if (negativeNum >= 0) {
            throw new ArithmeticException();
        }
        String num = "" + negativeNum;
        String reversed = "-";
        for (int i = num.length() - 1; i > 0; i--) {
            reversed += num.charAt(i);

        }
        negativeNum = Integer.parseInt(reversed);
        return negativeNum;
    }
}
/*
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */
