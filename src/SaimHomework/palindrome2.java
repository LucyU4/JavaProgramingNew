package SaimHomework;

public class palindrome2 {
    public static boolean isPalindrome (String str){
        String reverse = "";
        boolean result = false;
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse = reverse + str.charAt(i);

        }
        if (str.equals(reverse)){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "anna";

        str = str.toLowerCase();
        boolean a = isPalindrome(str);

        System.out.println(a);
    }
}
