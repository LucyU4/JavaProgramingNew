package day08_scanner;
import java.util.Scanner;
public class AddNumbers {
    /* Create a program that will ask the user to enter numbers. Add the numbers and print the result

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Scanner object
        System.out.println("Enter number1");
      int num1=  input.nextInt();// this is the one that let you type
        System.out.println(" Enter number 2");
        int num2 = input.nextInt();

        System.out.println(num1 +num2);//  System.out.println() + System.out.println()the variable makes it reusable.


    }
}
