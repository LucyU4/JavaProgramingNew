package day18_Loops;

import java.util.Locale;
import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean run = true;
        System.out.println("Bot is awake\nTo turn off say \"shutdown");
                while(run){
                    System.out.println("Enter your message");
                    String msg = input.nextLine().toLowerCase();

                    switch(msg){
                        case "hello":
                            System.out.println("How are you?");
                            break;
                        case" what is your agae":
                            System.out.println("I was programmed in July");
                            break;
                        case"what do you like?":
                            System.out.println("I like java");
                            break;
                        default:
                            System.out.println("Sorry, I dont get that");
                            break;
                        case"Enough":
                            System.out.println("SHUTTING DOWN");
                            run = false;





                    }
                }



    }
}
