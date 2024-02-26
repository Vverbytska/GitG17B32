package week4_mehtap;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars1("aaabbbccd"));
        System.out.println(frequencyOfChars2("aaabbbccd"));
    }


    public static String frequencyOfChars1(String str){
        String result ="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(!(result.contains(""+ str.charAt(i)))){
                result+=str.charAt(i) + "" + count;
            }
        }
        return result;
    }


    public static String frequencyOfChars2(String str){
        String result = "";
        int count;
        for (int i = 0; i <str.length() ; i++) {
          count =  Collections.frequency(Arrays.asList(str.split("")), ""+str.charAt(i));
            if(!result.contains("" + str.charAt(i))){
                result+=str.charAt(i) + "" + count;
            }
        }
        return result;
    }

}
//write a return method that can find the frequency of chars
//Ex: "aaabbcdd"--> a3b2c1d2