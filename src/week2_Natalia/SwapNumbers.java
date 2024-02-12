package week2_Natalia;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 45;

        // #1
//        int c = a;
//        a = b;
//        b = c;

        // #2
        int c = a+b;
        a = c-a;
        b = c-b;

        //or #3     b = c-a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
