package week4_Natalia;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(frequency(str));
        System.out.println("frequency2(str) = " + frequency2(str));

    }

    public static String frequency(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            int count = 0;
            if (result.contains(str.charAt(i)+"")){
                continue;
            }
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            result += "" + str.charAt(i) + count;
        }
        return result;
    }

    public static LinkedHashMap<Character,Integer> frequency2(String str) {
        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < str.length() - 1; i++) {
            int count = 0;
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            result.put(str.charAt(i), count);
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
