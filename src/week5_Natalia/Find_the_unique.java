package week5_Natalia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_the_unique {
    public static void main(String[] args) {
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));
        System.out.println("unique2(\"AAABBBCCCDEF\") = " + unique2("AAABBBCCCDEF"));


    }

    //    String -- Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static String unique(String str) {

        ArrayList<String> result = new ArrayList<>(Arrays.asList(str.split("")));
        result.removeIf(p -> Collections.frequency(result, p) > 1);

        return result.toString();
    }

    public static String unique2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i + 1).contains(str.charAt(i) + "") ||
                    str.substring(0, i).contains(str.charAt(i) + "")) {
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }

}
