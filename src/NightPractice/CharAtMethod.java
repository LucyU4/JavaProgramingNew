package NightPractice;

public class CharAtMethod {
    public static void main(String[] args) {


        String s = " Hello"; // 01234 index number
        s.charAt(0); // zero is here our index number = "H". if we put it this way we cannot reuse the char.
        System.out.println(s.charAt(0)); //we cannot reuse the char

        char ch1 = s.charAt(0); // in this case we can reuse this char
        System.out.println(ch1);
        System.out.println(ch1);
    }
}
