package week7_mehtap;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        System.out.println(maxNumber(3, 7, 9, 1, 7, 10, 3, 5));
    }
    public static int maxNumber(int...arr){
        int max=arr[0];
        for(int each: arr){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
}
