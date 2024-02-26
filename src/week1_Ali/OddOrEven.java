package week1_Ali;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 21;
        if (number%2 ==0){
            System.out.println(number+ " is even.");

        }else {
            System.out.println(number + " is odd.");
        }

        boolean isEven = number %2 ==0;
        boolean isOdd  = !isEven;
        System.out.println(number+ " is an even number: "+ isEven);
        System.out.println(number+ " is an odd number: "+isOdd);


    }
}

