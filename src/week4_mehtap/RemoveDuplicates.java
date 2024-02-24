package week4_mehtap;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDublicates1("aaabbbssdd"));
        System.out.println(removeDublicates2("aaabbbssdd"));

    }
    public static String removeDublicates1(String str){
        String result ="";
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(""+ str.charAt(i))){
               result+=str.charAt(i);
            }
        }
        return result;
    }

    public static String removeDublicates2(String str){
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
        return set.toString().substring(1, set.toString().length()-1).replace(", ","");
    }

}
//write a method that can remove the dublicated values from the string