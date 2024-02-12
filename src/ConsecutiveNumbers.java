import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        try (Scanner ConsecutiveNumbers = new Scanner(System.in)) {
            System.out.println("Please provide a single integer argument.");
            int x = ConsecutiveNumbers.nextInt();
            printConsecutiveNumbers(x);
        }
    }


    public static void printConsecutiveNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("Test");
                System.out.println("Codility");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("Codility");
                System.out.println("Coders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Test");
                System.out.println("Coders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }
    }
}