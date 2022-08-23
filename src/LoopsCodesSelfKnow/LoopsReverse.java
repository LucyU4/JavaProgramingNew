package LoopsCodesSelfKnow;

import day09_ifStatement.Letters;

import java.util.Scanner;

public class LoopsReverse {
    /*
    Space program
Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore
	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
     */
    public static void main(String[] args) {

            String letters = "java";

            String reversed = reverse(letters);
            System.out.println("The reversed letters is: " + reversed);
        }

        public static String reverse(String letters) {
            if (letters.isEmpty())
                return letters;

            return reverse(letters.substring(1)) + letters.charAt(0);
        }
    }

