package selfPractice;

import java.util.function.DoubleToIntFunction;

public class UpperCaseLowerCase {
    public static void main(String[] args) {
        /*
        Declare and assign a String
print the String in all uppercase format and
print the String in all lowercase format
         */

        String s = " Good Evening ";
        s.toLowerCase();
        System.out.println(s);// we will get the original value
        s=s.toLowerCase();// we will lose our value
        System.out.println(s);
        s =s.toUpperCase(); // we will lose lower case value
        System.out.println(s);
    }
}
