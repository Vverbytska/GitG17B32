package week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        // initialize the input string
        String str = "AAABBCDD";

        // make a new HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // iterate over each character in the input string
        for (char ch : str.toCharArray()) {
            // when the character is already in the HashMap increment the frequency
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                // add the character to the HashMap with a frequency of 1
                frequencyMap.put(ch, 1);
            }
        }

        // make the result string from the frequency map
        StringBuilder result = new StringBuilder();

        // iterate  over each entry in the frequency map
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            // when the result string is not empty, add a space to separate the entries
            if (result.length() > 0) {
                result.append(" ");
            }

            // add  the character and its frequency to the result string
            result.append(entry.getKey()).append(":").append(entry.getValue());
        }

        // print the result string
        System.out.println(result.toString());
    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */