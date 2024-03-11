package week6_Valeriia;

public class MaxInArr {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 10, -10};
        System.out.println(maxInArr(arr));
    }

    public static int maxInArr(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

}
//Write a method that can find the maximum number from an int Array