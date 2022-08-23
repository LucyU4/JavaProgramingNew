package selfPractice;

public class lowercase {
    public static void main(String[] args) {
        String s = " HELLO ";
        System.out.println(s);// original upper case Hello
        System.out.println(s.toLowerCase());// hello
        s = s.toLowerCase();// I changed the value to lower case
        System.out.println(s);// I will get the original value

         String s1 = s.toLowerCase();// I will not lose the original value
        s1 =s.toUpperCase();

        System.out.println(s);
        System.out.println(s1);
    }
}