package day20_loops;
import java.util.Scanner;
public class CamelCase {
    /*
  Camel Case
Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
Ex:
	Today is SUNDAY
	Output:
	todayIsSunday
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple word");
        String str = input.nextLine().toLowerCase();
        String camelCase = " ";

        for (int i = 0; i < str.length(); i++) ;
    }}