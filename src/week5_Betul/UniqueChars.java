package week5_Betul;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueChars {
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        // sorted order the every single character of the string as a list
        List<String> chars = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : chars) {  //for each loop gets  every single character
            if (str.indexOf(each) == str.lastIndexOf(each)) { //compare the starts from first index last index
                System.out.print(each);
            }
        }
    }
}






/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==>"DEF";
 */
