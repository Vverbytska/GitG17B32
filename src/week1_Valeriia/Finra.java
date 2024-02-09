package week1_Valeriia;

import java.util.Arrays;

public class Finra {
    public static void main(String[] args) {

        System.out.println(finra(30));
    }

    public static String finra(int n){
        String result = "";

        for (int i = 1; i <= n; i++) {

            if(i % 15 == 0){
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0 ) {
                result += "FIN ";
            }else {
                result += i +" ";
            }
        }
        return result;
    }
}
/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */
