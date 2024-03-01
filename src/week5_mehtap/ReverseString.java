package week5_mehtap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("elif"));
        System.out.println(reverse2("elif"));
        System.out.println(reverse3("elif"));
    }

    //1st a return method that can reverse a string
    public static String reverse(String str){
        String reversedString ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedString+=str.charAt(i);
        }
        return reversedString;
    }

    //2nd a return method that can reverse a string
    public static String reverse2(String str){
        return new StringBuilder(str).reverse().toString();
    }

    //3rd a return method that can reverse a string
    public static String reverse3(String str){
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(list);
        return list.toString().substring(1, list.toString().length()-1).replace(", ", "");
    }



}
