package Week2_Betul;

public class Consecutive {

    public static void main(String[] args) {
        consecutiveNumbers(30);
    }
    public static void consecutiveNumbers(int n){

        for (int i = 1; i <=n ; i++) {

            String result = "";

            if (i % 2 ==0 && i % 3 == 0 && i % 5 == 0){
                result +="codilitytestcoders";
            } else if (i % 2 == 0 && i % 3 == 0) {
                result +="codilitytest";
            }else if (i % 3 == 0 && i % 5 == 0) {
                result += "testcoders";
            }else if (i % 2 == 0 && i % 5 == 0) {
                result += "codilitycoders";
            }else if (i % 5 == 0) {
                result += "coders";
            }else if (i%3 == 0 ) {
                result += "test";
            }else if( i%2 == 0) {
                result += "codility";
            }else {
                result += i;
            }

            System.out.println(result);
        }




    }

}

