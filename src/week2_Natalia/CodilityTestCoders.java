package week2_Natalia;

public class CodilityTestCoders {
    public static void main(String[] args) {
        consecutive(24);

    }

    private static void consecutive(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                String str = "";
                if (i % 2 == 0) {
                    str += "Codility";
                }
                if (i % 3 == 0) {
                    str += "Test";
                }
                if (i % 5 == 0) {
                    str += "Coders";
                }
                System.out.println(str);

            } else {
                System.out.println(i);
            }
        }

    }
}
/*
Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.

    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.

    If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

    For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N — 24:
        1
        Codility
        Test
        Codility
        Coders
        CodilityTest
        7
        Codility
        Test
        CodilityCoders
        11
        CodilityTest
        13
        Codility
        TestCoders
        Codility
        17
 */
