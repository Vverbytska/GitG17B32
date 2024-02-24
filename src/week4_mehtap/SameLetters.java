package week4_mehtap;

import java.util.Arrays;
import java.util.Collections;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(isSameLetters("abcd", "dcba"));
    }

    public static boolean isSameLetters(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        String[] str1Arr = str1.split(""); Arrays.sort(str1Arr);
        String[] str2Arr = str2.split(""); Arrays.sort(str2Arr);
        return Arrays.equals(str1Arr, str2Arr);
    }



}
//write a method that can check if a string is build out of the same letters as another string
//("abc", "cab");-->true