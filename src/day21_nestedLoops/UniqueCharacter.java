package day21_nestedLoops;

public class UniqueCharacter {
    /*
   java
   given a String find the print all the unique characters
   unique character: only appears in the String once
   outut: jv
    */
    public static void main(String[] args) {
       String str ="java";

        // outer loop is labeled as first
        first:
        for (int i = 0; i<str.length();i++) {

            // inner loop
            for (int j = 0; j <str.length();j++) {

                System.out.println(str.charAt(i) + " = " + str.charAt(j));

             }

                    // skips the current iteration of outer loop

            System.out.println();

            }}}






