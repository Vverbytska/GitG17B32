package Week5_Nabella;

public class T2_StringReverse {

    public static void main(String[] args) {

     String Str = "ABCD";
     String result =" ";

        for (int i =Str.length()-1; i>=0 ; i--) {
               result += Str.charAt(i);
        }

        System.out.println(result);






        //String -- Reverse
        //Write a return method that can reverse String
        // Ex: Reverse(); ==> DCBA






    }
}
