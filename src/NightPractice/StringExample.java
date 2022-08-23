package NightPractice;

public class StringExample {
    public static void main(String[] args) {

        java.lang.String s= "first";
        String s2 = new String("second");
        System.out.println(s2 == s);

        String s3 = new String("first");
        System.out.println(s3 == s);

        String s4 = "second";
        System.out.println( s == s4);

        String s5 ="first";
        System.out.println(s == s5);

    }
}
