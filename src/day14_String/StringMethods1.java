package day14_String;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class StringMethods1 {
    public static void main(String[] args) {


        String item = "pen";// this one is in String pool
        String item2 = new String("pen"); // directly in heap
        System.out.println(item == item2);// checks if the object item is the same object as item2

        String item3 = new String("pen");
        System.out.println((item2 == item3)); //compares the two objects. They are both in the heap. they have unique different subject, the equal method is used to compare which checks if the characters are the same.

        System.out.println(item.equals(item3));
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));
        System.out.println();
        System.out.println(item.equals("Pen"));// checks for exact characers including cases
        System.out.println(item.equals("Pen"));// checks only for matching characters and ignores all the cases

        System.out.println("----------------------------------");
        String username = "jamesbond";
        String password = "BOND007";
      //  System.out.println(username.equals("JAMESBOND));
        System.out.println(username.equals("JAMESBOND"));
        System.out.println(password.equals("BOND007"));
        System.out.println(password.equalsIgnoreCase("bond007"));

        System.out.println("--------------------------------");

        String day= "Tuesday"; // we will get 7.
        System.out.println(day.length());// counts how many character there is one prints only once
        String day2 =" Fiday";
        int len = day2.length();//we declare, length(method gives back int type, so we can use it however we want.

        System.out.println(len+ 10);

        String str =" hello "; // the characters for hello are 5 long but the spaces also are character, so the space in the beginning and end are included, which means the total length is 7
        System.out.println(str.length());// prints how many characters the sting has, not the string

        System.out.println(str);

        System.out.println("------------------------------");
        String word ="Summer";// "word" is the reference / or name and "Summer " is the value of the String Object;
        word.toUpperCase();// the uppercase method makes all the character uppercase, but we didn't do anything with this  value;
        System.out.println(word);
        word = word.toUpperCase();// this time we make all the character uppercase, then th String give us nack of all uppercase ws reassign into the variable

        System.out.println(word);
        System.out.println(word);

        System.out.println("---------------------------------");

        String sentence = " hello My NAME is ";
        System.out.println(sentence.toLowerCase());// make a new String that was all lowercase, and then printed it
        System.out.println(sentence); // print the original String, because String is immutable it cannot change.
        String lowerVer = sentence.toLowerCase();// the new object from the method is sorted ino the new variable
        // option3:reassign
        // sentence = sentence.toLowerCase()

        System.out.println(sentence);
        System.out.println("---------------------------");
        String s = "   java  ";
        System.out.println(s.length());
        s = s.trim(); // trim method gets rid of all the extra spaces in the beginning and end of the String
        System.out.println(s);
        System.out.println(s.length());

        String s2 = " multiple words here  ";
        System.out.println(s2.length());// in here the s2 has 27 character
        System.out.println((s2.trim()));// trim() will remove from the beginning and end, middle spaces will not be touch
    }
}