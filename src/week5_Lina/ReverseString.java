package week5_Lina;

public class ReverseString {
    public static String reverse(String input) {

        // create an empty string to store the reversed string.
        StringBuilder sb = new StringBuilder();

        // loop through each character in the input string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        // Return the reversed string..
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD")); // Output: DCBA
    }
}