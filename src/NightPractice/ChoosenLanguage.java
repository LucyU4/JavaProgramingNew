package NightPractice;

import java.util.Scanner;

public class ChoosenLanguage {

    //create a class ChooseLanguage

    //ask the user to enter a number based on the language they wanted to use.
    //	1 - English
    //	2 - Spanish
    //	3 - Turkish
    //	4 - Russian
    //	5 - French
    //based on the number they picked print a message:

    //	1 : "hello, thank for your call"
    //    2 : "hola, gracias para llamar"
    //    3 : "merhaba, aradiginiz icin tesekkurler"
    //    4 : "privet, spasibo za vash zvonok"
    //    5 : "Merci ,pour votre appel"
    //    any other number: "We will use English by default"
    //   Extra: add your own options

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int language = 0;
        int number = input.nextInt();
        if (number == 1) {
            language = 1;
            System.out.println(language + " English");
            System.out.println("Hello, thank you for your call");

        } else if (number == 2) {
            language = 2;
            System.out.println(language + " Spanish");
            System.out.println("hola, gracias para llamar");

        } else if (number == 3) {
            language = 3;
            System.out.println(language + " Turkish");
            System.out.println("merhaba, aradiginiz icin tesekkurler\"");

        } else if (number == 4) {
            language = 4;
            System.out.println(language + " Russian");
            System.out.println("privet, spasibo za vash zvonok\"");

        } else if (number ==5){
            language = 5;
            System.out.println(language + " French");
            System.out.println("Merci ,pour votre appel");



              System.out.println("pease eneter the number between 1-5");
        }
    }
}
