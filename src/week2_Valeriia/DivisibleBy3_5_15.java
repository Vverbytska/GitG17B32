package week2_Valeriia;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

        divisibleBy(100);
    }

    public static void divisibleBy(int n){
        String dBy15 = "Divisible by 15: ";
        String dBy5 = "Divisible by 5: ";
        String dBy3 = "Divisible by 3: ";

        for (int i = 1; i < n; i++) {
            if(i % 15 == 0){
                dBy15 += " " + i ;
            }else if(i % 5 == 0){
                dBy5 += " " + i;
            }else if(i % 3 == 0){
                dBy3 += " " + i;
            }
        }
        System.out.println(dBy15);
        System.out.println(dBy5);
        System.out.println(dBy3);
    }
}
