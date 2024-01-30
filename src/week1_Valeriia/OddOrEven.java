package week1_Valeriia;

public class OddOrEven {

    public static void main(String[] args) {

        identify(8);
    }

    public static void identify(int n){
        if(n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
