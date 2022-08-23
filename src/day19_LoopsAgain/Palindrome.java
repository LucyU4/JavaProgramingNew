package day19_LoopsAgain;

import java.util.Scanner;

public class Palindrome {

    /*
    given a String determine if it is palindrome
    palindrome means the String is read the same forwards and backwards

    ex:
    anna
    racaecar
    maam
    abcba
     */
    public static void main(String[] args) {
        String s = "racecar";
        String reverse ="";

        //1) reverse my String , read from last index. backwards

for(int i =s.length()-1; i>= 0; i--) {// i is just a number . nut using length -1 allow me to find the last index of the String, that means we can use that index to read characters.

    reverse += s.charAt(i);// revers= reverse + s.charAt(i);
}
if(s.equals(reverse)){
    System.out.println("Palindrome");
    System.out.println("Not palindrome");


}
        System.out.println(s.equals(reverse)? "Palindrome": "Not Palindrome");
    }
}
