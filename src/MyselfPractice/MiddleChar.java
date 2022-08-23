package MyselfPractice;

import java.util.Scanner;

public class MiddleChar {

        /*
        [Middle char]
Given a String, write a program to display the middle character of a
string
a) If the length of the string is even there will be two middle
characters.
b) If the length of the string is odd there will be one middle
character.
Input:
elephant
Output:
The middle characters: ph
-----------------------------------------------
         */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a word");
            String word = scan.nextLine();
            // elephant
           //  012345678
            boolean isEven = word.length()%2 == 0;
            boolean isOdd = word.length()%2 ==1;

            if(isEven) {
                System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
            }else if(isOdd){
                System.out.println(word.substring(word.length()/2 -1, word.length()/2));
            }

    }
}
