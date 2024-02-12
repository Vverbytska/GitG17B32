public class Main {

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        // Example usage
        int num1 = 5;
        int num2 = 6;

        String result1 = identify(num1);
        String result2 = identify(num2);

        System.out.println(num1 + " is " + result1);
        System.out.println(num2 + " is " + result2);
    }
}
