package NightPractice;

import java.util.Scanner;
// create a char variable letter with scanner. Find and print if the character is a letter.
// number , or special character
public class CharScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char character = scan.next().charAt(0);

        boolean letters = character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z';

        boolean numbers = character >= '0' && character <= '9';

        if (letters) ;
        {
            System.out.println("it is a letter");
        }
        if (numbers) {
            System.out.println("it is a number");

            if (!letters && !numbers) ;
        }

        System.out.println("it is a special character");

        {
            boolean x = !(letters && numbers);

            if (x);

        }
    }
}