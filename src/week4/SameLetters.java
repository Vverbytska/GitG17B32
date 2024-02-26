package week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {
        String a = "aaasdf";
        String b = "fdsaaa";

        if (a == null || b == null) {
            System.out.println(false);
        }
        // checks if the strings are of different lengths
        else if (a.length() != b.length()) {
            System.out.println(false);
        }
        // checks if the strings have the same characters
        else {
            char[] left = a.toCharArray();
            char[] right = b.toCharArray();
            Arrays.sort(left);
            Arrays.sort(right);
            System.out.println(Arrays.equals(left, right));
        }
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false
 */