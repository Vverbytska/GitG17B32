package week6_betul;

public class sumOfDigits {

    public static void main(String[] args) {
        System.out.println(sum("ey22lu22l"));
    }
    public static int sum(String str){
        int sum=0;
        for (char each : str.toCharArray()) {
            if(Character.isDigit(each)){
                sum+= Integer.parseInt(each+"");
            }
        }
        return sum;
    }
}






/*
Write a method that can return the sum of the digits in a string
 */
