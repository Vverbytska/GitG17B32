package week5_mehtap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(findUniqueChars("AAABBBCCCDEF"));
    }

    public static String findUniqueChars(String str){
        List<String> chars = new ArrayList<>(Arrays.asList(str.split("")));
        chars.removeIf(p-> Collections.frequency(chars,p)>1);

        return chars.toString().substring(1, chars.toString().length()-1).replace(", ", "");

    }
}
//write a return method that can find unique characters from the string