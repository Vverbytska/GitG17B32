package week3_Ali;

import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a negative number:");
        int number = input.nextInt();

        if (number >=0){
            System.err.println("Number should be negative");
            System.exit(0);
        }

        int reversed = 0;

        while(number != 0)
        {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reversed);
    }
    /*
    2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */


}
