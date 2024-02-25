package week4_Valeriia;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(isSame("aab", "abb"));
    }
    
    public static boolean isSame(String str1, String str2){

        boolean isSame = false;
        if(str1.length() != str2.length()){
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(str1.charAt(i) + "") && (str1.contains(str2.charAt(i) + ""))) {
                isSame = true;
            } else {
                isSame = false;
                break;
            }
        }
        return isSame;

/*
        String[] arr1 = str1.split("");
        Arrays.sort(arr1);

        String[] arr2 = str2.split("");
        Arrays.sort(arr2);
        return Arrays.equals(arr2, arr1);


 */


    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */