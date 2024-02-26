package week1_Natalia;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 6;
        OddOrEven(num);
    }

    public static void OddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is Even");
        } else {
            System.out.println("Number " + number + " is Odd");
        }
    }
}
