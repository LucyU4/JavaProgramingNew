package selfPractice;

import java.util.Scanner;

public class groupStudy2 {
    public static void main(String[] args) {

        /* If statement practice:

        Do all tasks hard coded at least then optionally make them more dynamic with scanner
        Create two number variables
        Find and print which number is bigger between the two
        ex: 50
            45
            output
            50 is bigger
         */
        Scanner input = new Scanner(System.in);

        int num1 =input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " is bigger ");

        }else{

            System.out.println(num2 + " is bigger");

        }



       }
       }
