package week5_Ali;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter a text:");
        String str = input.nextLine();

        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.charAt(i));
        }
    }

}
