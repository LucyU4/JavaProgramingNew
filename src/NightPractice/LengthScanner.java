package NightPractice;

import java.util.Scanner;



public class LengthScanner {
    /*
   Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters
    */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();// next - one word nextline - for multiple word or sentence
         s1 = s1.trim();
        System.out.println("lowercase: " + s1);
        System.out.println("Trim: " + s1.trim());
        System.out.println("Number of characters: " +  s1.length());
        s1 = s1.toUpperCase();
        System.out.println("Upper case: " + s1);
    }
}