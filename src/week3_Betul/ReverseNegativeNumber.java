package week3_Betul;

import java.util.Scanner;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverse(-123));
        System.out.println(reverse(432));

    }
    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0){
            int remainder = number % 10;// 123%10 ==> 3 --- 12%10 ==> 2 --- 1%10 ==> 1
            number = number /10;// 123/10 ==> 12 --- 12/10 ==>1 --- 1/10 ==>0
            reverse = (reverse * 10) +remainder;// 3 --- 32 --- 321
        }
        return reverse;




    }
}

//2. Numbers -- Reverse negative number
//Write a return method that can reverse
//negative number and return it as int