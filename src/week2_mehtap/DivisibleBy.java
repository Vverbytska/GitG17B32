package week2_mehtap;

public class DivisibleBy {
    public static void main(String[] args) {
        String result1 ="Divisible By 15 ";
        String result2 ="Divisible By 5 ";
        String result3 ="Divisible By 3 ";

        for (int i = 1; i <=100 ; i++) {

            if(i%15==0){
                result1 += i +" ";
            }else if(i%5==0){
                result2 += i + " ";
            } else if(i%3==0){
                result3 += i + " ";
            }
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
