package day09_ifStatement;

public class Letters {
    public static void main(String[] args) {

         char letter = 'f';

        if(letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is an uppercase letter");
        }

        /*if(letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is an uppercase letter");
       */
      if(letter >= 'a' &&  letter <= 'z') {
          System.out.println(letter + " is an lowercase letter");
      }
       /*
        if(letter >= 'a' &&  letter <= 'z') {
          System.out.println(letter + " is an lowercase letter");
        */
    }
}
