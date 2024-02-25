package week1_Valeriia;

public class DivideWithoutOperator {
    public static void main(String[] args) {

            System.out.println(divide(-10, -2));
    }

    public static int divide(int n1, int n2) {

        if (n1 == 0 || n2 == 0) {
            return 0;  // assume we want result to be 0 if input divisor is 0
        }

        // to determine if result is going to be - or +
        boolean isResultNegative = false;

        if(n1 < 0){
            n1 = -n1;       // convert to positive
            if(n2 < 0){     // if this is true - and - will give us +
                n2 = -n2;
            }else {         // if n2 is > 0 then the result is negative
                isResultNegative = true;
            }
        }else if(n2 < 0){   // if n1 is positive we check n2
            n2 = -n2;
            isResultNegative = true;
        }

        // actual division block
        int result = 0;
        while(n1 >= n2){    // while dividend is bigger that divisor we keep subtracting n2
            n1 -= n2;
            ++result;       // and count subtractions which is our result of division
        }

        // if one of numbers was negative we make the result negative as well
        if(isResultNegative){
            result = -result;
        }

        return result;

    }
}
