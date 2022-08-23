package day18_Loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int validPin = 1234;
        int userPin;
        int attempts =3;

        Scanner input = new Scanner(System.in);
//  purpose of this loop was to allow reattempts logic
        do {
            System.out.println("Enter your Pin");
            userPin = input.nextInt();
            attempts++;

        }while(userPin !=  validPin);// the middle is to check  keep running the loop if the attempt has been less than 0 and the pin is the matching yet.


        if(attempts <3 && userPin ==validPin) {// the rest of this part here is to keep running
            System.out.println("logged in");

        }else{
            System.out.println("Locked account, too many attempts");
        }
    }


    }

