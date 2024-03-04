package Week5_Nabella;

public class T1_UniqueCharacter {

 public static void main(String[] args) {


  String Str = "AAABBBCCCDEF";
  String unique = " ";

  for (int i = 0; i < Str.length(); i++) {
     char ch = Str.charAt(i);
   if (Str.indexOf(ch) == Str.lastIndexOf(ch)) {
    unique += ch;
   }
  }
  System.out.println(unique);

 }
}

//String -- Find the unique
//Write a return method that can find the unique characters from the String
// Ex: unique("AAABBBCCCDEF") ==> "DEF";