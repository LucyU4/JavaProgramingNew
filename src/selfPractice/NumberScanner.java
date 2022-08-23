package selfPractice;

import java.util.Scanner;

public class NumberScanner {
    ///*Create two number variables
    //Find and print which number is bigger between the two
    //ex:
    //50
    //45
    //output:
    //50 is bigger
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 > num2) {

            System.out.println(num1 + " is bigger than " + num2);

        } else {

            System.out.println(num2 + " is bigger than " + num1);
        }
    }
}









