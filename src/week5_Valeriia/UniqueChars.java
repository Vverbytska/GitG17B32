package week5_Valeriia;

public class UniqueChars {

    public static void main(String[] args) {
        System.out.println(uniqueChars("AAABBBCCCDEF"));
    }

    public static String uniqueChars(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    frequency++;
                }
            }
            if(frequency==1){
                result += ""+str.charAt(i);
            }
        }

        return result;
    }


}
/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */