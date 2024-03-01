package week5_Ali;

import java.util.Scanner;

public class FindTheUnique {
    public static void main(String[] args) {


        String str = "ABcdeeeffgghjp223";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }
        System.out.println(result);

    }
}
