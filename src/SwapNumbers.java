public class SwapNumbers {
    public static void main(String[] args) {
        int x = 25, y = 23;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        x = x + y; // x now becomes 48
        y = x - y; // y now becomes 25
        x = x - y; // x now becomes 23
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}