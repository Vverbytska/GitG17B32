package Week_06;

public class T3_SumOfDigits {

    public static void main(String[] args) {
                String input = "Hello123World456";
                int sum = calculateDigitSum(input);
                System.out.println("The sum of digits in the string is: " + sum);
            }

            public static int calculateDigitSum(String input) {
                int sum = 0;
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (Character.isDigit(c)) {
                        sum += Character.getNumericValue(c);
                    }
                }
                return sum;
            }
        }





