public class DivisibleNumbers {
    public static void main(String[] args) {
        // Print numbers divided by 3
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n"); 

        // Print numbers divided by 5
        System.out.println("Divided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n"); 

        // Print numbers divided by both 3 and 5
        System.out.println("Divided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }
}