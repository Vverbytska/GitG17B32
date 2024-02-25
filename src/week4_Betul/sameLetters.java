package week4_Betul;

import java.util.Arrays;

public class sameLetters {
    public static void main(String[] args) {

        System.out.println(same("abc", "cab"));
        System.out.println(same("abc", "abb"));
    }

        public static boolean same (String str1, String str2){
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            String same1 = "", same2 = "";
            for (char each : ch1)
                same1 += each;
            for (char each : ch2)
                same2 += each;
            return same1.equals(same2);
        }
    }




/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
