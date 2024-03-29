package week4_Betul;

public class frequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(FrequencyOfCharacters("AAABBCDD"));
    }

    public static String FrequencyOfCharacters(String str) {
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += count;

        }
        return result;
    }

}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
