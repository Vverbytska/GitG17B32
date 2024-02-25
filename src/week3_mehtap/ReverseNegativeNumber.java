package week3_mehtap;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-12));
    }
    public static int reverseNegativeNumber(int number){
        if(number>=0){
            throw new ArithmeticException("number should be less than zero");
        }
      String numStr = "" + number;
      String result= "-";
      for(int i =numStr.length()-1; i>0; i--){
          result+= numStr.charAt(i);
      }
        return Integer.parseInt(result);
    }

}
// write a method to reverse a negative number and return as an int