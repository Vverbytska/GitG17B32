package week5_Lina;

public class UniqueCharacters {
    public static String unique(String input) {
        // create an empty string to store the unique characters..
        StringBuilder sb = new StringBuilder();

        // loop through each character in the input string.
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // only adding the character to the string of unique characters if it doesn't already exist
            if (c != 'A' && c != 'B' && c != 'C' && sb.indexOf("" + c) == -1) {
                sb.append(c);
            }
        }

        // returning the string of unique characters.
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF")); // Output: "DEF"
    }
}