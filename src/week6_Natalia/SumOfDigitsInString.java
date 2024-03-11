package week6_Natalia;

public class SumOfDigitsInString {
    public static void main(String[] args) {

        String str = "asd123dfg45671";
        System.out.println("sumDigits(str) = " + sumDigits(str));

    }

    public static int sumDigits(String str){
        int sum =0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.charAt(i) + "");
            }
        }

        return sum;
    }
}
