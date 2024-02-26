package week1_Betul;

public class Finra {

    public static void main(String[] args) {
        finra();
    }

    public static void finra(){

        String result = "";


        for (int i = 1; i < 31 ; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");

            }else if (i % 3 == 0){
                System.out.println("FIN");
            }else {
                System.out.print(i + " ");
            }
        }
        System.out.println(result);
    }


    }







/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number
 */