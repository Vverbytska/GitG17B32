package week2_mehtap;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        consecutiveNumbers(20);
    }
    public static void consecutiveNumbers(int n ){
        for (int i = 1; i <=n ; i++) {
            boolean codility = i%2==0;
            boolean test = i%3 ==0;
            boolean coders = i%5==0;
            String result="";

            if(codility && test && coders){
               result +="CodilityTestCoders";
            }else if(codility && test){
                result+="CodilityTest";
            }else if(codility && coders){
                result+="CodilityCoders";
            }else if (test && coders){
                result+= "TestCoders";
            }else if(codility){
                result+="Codility";
            }else if(test){
                result+="Test";
            }else if(coders){
                result+="Coders";
            }else {
                result+=i;
            }
            System.out.println(result);
        }
    }
}
