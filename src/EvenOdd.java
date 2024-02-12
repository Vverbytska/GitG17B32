public class Main {

    // Main method to execute the program
    public static void main(String[] args) {
        // Call the method to print numbers according to the specified conditions
        printFinra();
    }

    // Method to print numbers from 1 to 30 with specific conditions
    public static void printFinra() {
        // Iterate through numbers from 1 to 30
        for (int i = 1; i <= 30; i++) {
            // Check if the current number is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {  // Check if the current number is a multiple of 3
                System.out.println("FIN");
            } else if (i % 5 == 0) {  // Check if the current number is a multiple of 5
                System.out.println("RA");
            } else {
                // If the number doesn't meet any of the conditions, print the number itself
                System.out.println(i);
            }
        }
    }
}
