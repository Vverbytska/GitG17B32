package week4_Valeriia;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }

    public static String removeDuplicates(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(""+str.charAt(i))){
                result += ""+str.charAt(i);
            }
        }
        return result;

        /*
        String[] arr = str.split("");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        arr = set.toArray(new String[0]);

        return Arrays.toString(arr);

         */


    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */