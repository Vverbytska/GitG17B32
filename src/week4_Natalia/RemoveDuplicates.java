package week4_Natalia;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("onlyUnique(\"AAABBBCCC\") = " + onlyUnique("AAABBBCCC"));


    }

    public static String onlyUnique(String str) {
        LinkedHashSet<String> set = new LinkedHashSet<>(List.of(str.split("")));
        String result = "";
        for (String each : set) {
            result += each;
        }
        return result;

    }
}

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */