package week2_Valeriia;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        b = b - a;
        a = b + b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
