package week2_Natalia;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 45;

        // #1 with 3rd variable
//        int c = a;
//        a = b;
//        b = c;

        // #2  without
        a +=b;
        b = a-b;
        a-=b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
