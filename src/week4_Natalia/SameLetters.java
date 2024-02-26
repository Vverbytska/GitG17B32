package week4_Natalia;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(compareLetters("aab", "abb"));
        System.out.println(compareLetters2("aab", "abb"));
        System.out.println(compareLetters3("aab", "abb"));

    }

    public static boolean compareLetters(String str1, String str2){

        String[] result1 =str1.split("");
        Arrays.sort(result1);

        String[] result2 =str2.split("");
        Arrays.sort(result2);

        return Arrays.equals(result1,result2);
    }
    public static boolean compareLetters2(String str1, String str2){
        Map<Character, Integer> result1 = new LinkedHashMap<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            int count = 0;
            for (int j = 0; j < str1.length() - 1; j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    count++;
                }
            }
            result1.put(str1.charAt(i), count);
        }
        Map<Character, Integer> result2 = new LinkedHashMap<>();
        for (int i = 0; i < str2.length() - 1; i++) {
            int count = 0;
            for (int j = 0; j < str2.length() - 1; j++) {
                if (str2.charAt(i) == str2.charAt(j)) {
                    count++;
                }
            }
            result2.put(str2.charAt(i), count);
        }
        return result2.equals(result1);
    }

    public static boolean compareLetters3(String str1, String str2){
        Map<Character, Integer> result1 = FrequencyOfCharacters.frequency2(str1);
        Map<Character, Integer> result2 = FrequencyOfCharacters.frequency2(str2);
        return result1.equals(result2);
    }



}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false
 */
