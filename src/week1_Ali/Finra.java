package week1_Ali;

public class Finra {
    public static void main (String[] args){
        String result = "";
        for (int i = 1; i <31 ; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result  += "FINRA ";
            } else if (i % 5 ==0) {
                result  +="RA ";
            } else if (i % 3 == 0) {
                result  += "FIN ";
            }else
                result  += i+ " ";

        }
        System.out.println(result);
    }
}
