package Week4_Sumaya;

import java.util.Arrays;

public class SameLetters {


    public static boolean same(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        System.out.println(same("abc", "cab")); // Output: true
    }


    }





/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

The count() method returns the number of times a specified value appears in the string.



 */