package Week4_Sumaya;

public class FrequencyOfChar {


    public static void main(String[] args) {

        String given = "AAABBCDD";
        String result = "";

        for (int i = 0; i < given.length();) {
            String chr = "" + given.charAt(i);
            int count = 0;
            while(given.contains(chr)){
                count += 1;
                int indexOfChr = given.indexOf(chr);
                given = given.replaceFirst(given.charAt(indexOfChr)+"","");
            }
            result += chr + count;
        }
        System.out.println(result);
    }


}
/*
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */