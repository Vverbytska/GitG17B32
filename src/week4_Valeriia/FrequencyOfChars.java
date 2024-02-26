package week4_Valeriia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChars {

    public static void main(String[] args) {
        System.out.println( frequencyOfChars("AAABBCDD") );
    }

    public static String frequencyOfChars(String str){
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            if(result.contains(""+str.charAt(i))){
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)== str.charAt(j)) {
                    frequency++;
                }
            }

            result += ""+ str.charAt(i)+frequency;
        }
        return result;

/*
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        for (String each : list) {
            if(result.contains(each)){
                continue;
            }
            result += "" +each + Collections.frequency(list, each);
        }
    return result;

 */
    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */