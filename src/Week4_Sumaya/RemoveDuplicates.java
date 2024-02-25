package Week4_Sumaya;

public class RemoveDuplicates {




    public static String removeDup(String str) {
        return str.replaceAll("(.)\\1+", "$1");
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC")); // Output: ABC
    }

}
