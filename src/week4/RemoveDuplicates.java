package week4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result = removeDup(input);
        System.out.println(result); // output becomes  "ABC"
    }

    public static String removeDup(String str) {
        StringBuilder result = new StringBuilder();

        // iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean duplicate = false;

            // checks if the current character is already present in the result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    duplicate = true;
                    break;
                }
            }

            // when the character is not a duplicate add it to the result
            if (!duplicate) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */
