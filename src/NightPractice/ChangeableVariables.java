package NightPractice;

public class ChangeableVariables {
    public static void main(String[] args) {

        String name = " hello"; // this method is lateral inside the string pool,
        String name1 = " hello";
        String name2 = " hello";
        System.out.println(name == name1 && name == name2);

        String b1 = new String ( "hello"); // New  keyword
        String b2 = new String ( "hello");
        System.out.println(b1 ==b2);

        System.out.println("----------------------------------------");


    }
}
