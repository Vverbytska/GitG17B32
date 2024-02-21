package week1_Ali;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        divide(25, 0);
        divide(25, 5);
        divide(25, 3);

    }

    public static void divide(int a, int b) {

        if (b == 0) {
            System.out.println("Error!! NOT divisible by Zero");
            return;
        }

        int count = 0; // how many times i can divide the counter tell how many times divide start from zero
        String result = a + " divided by " + b + " = ";

        while (a >= b) {
            count++;
            a -= b;
        }

        System.out.println(result + count + " remainder: " + a);

    }
}
