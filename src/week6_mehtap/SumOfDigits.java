package week6_mehtap;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum("aaa1234bb3"));
    }
    public static int sum(String str){
       int sum=0;
        for (char each : str.toCharArray()) {
            if(Character.isDigit(each)){
                sum+= Integer.parseInt(""+each);
            }
        }
        return sum;
    }
}
//write a method that returns sum of digits in a string