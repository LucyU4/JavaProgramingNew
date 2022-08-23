package day16_string;

public class LongestA {
    public static void main(String[] args) {

/*
-----------------------------------------------------------------
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word
that also contains 'a'
Ex:
"java"
"mouse"
"computer"
Output: java
Challenge: Instead of just checking for "a" add another variable that can
be used to check for any character.
 */

        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";
        int word1Len = word1.length();
        int word2Len = word1.length();
        int word3Len = word1.length();
        String longest  = "";

        ;
        if (word1.contains("a") && word1Len >longest.length()) {
            longest = word1;
            System.out.println(word1 + " is the longest with a");

        }if(word2.contains("a")  && word2.length()> longest.length()){
            longest = word2;
        }if(word3.contains("a")  && word3.length()> longest.length()){
            longest = word3;
            // }else if(word2.contains("a") && word1Len > wo
       // }else if(word2.contains("a") && word1Len > word2Len && word2Len> word3Len){
       //     System.out.println(word2 + " is the longest with a");
      //  }else if(word3.contains("a") && word3Len > word1Len && word2Len> word3Len) {
       // }else {
            System.out.println(" No one word was the longest");
        }
    }
}