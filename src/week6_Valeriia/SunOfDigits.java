package week6_Valeriia;

public class SunOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits("A2Bbb4D3H17"));
    }

    public static int sumOfDigits(String str){
        int sum =0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(""+str.charAt(i));
            }
        }

        return sum;
    }
}
//Write a method that can return the sum of the digits in a string