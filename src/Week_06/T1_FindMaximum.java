package Week_06;

public class T1_FindMaximum {

    public static void main(String[] args) {

        int [] numbers = {2,34,-5,77,2};

        int max =numbers[0]; //assume that first element is the maximum  number

        for (int i = 1; i < numbers.length; i++) { // i:1,2,3,4,...

            if(numbers[i]>max){  // compares the element of the array with current maximum number
                max = numbers[i]; // replace the current maximum number
            }

        }
        System.out.println("max = " + max);

        // for finding the maximum number we can use loop in Array

    }
}
