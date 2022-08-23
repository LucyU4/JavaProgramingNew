package day21_nestedLoops;

public class biggestSubstring {
    /*
    Biggest substring of matching characters

Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:
            aaabbbcccccddddee
        Output:
            ccccc
     */
    public static void main(String[] args) {
        String str = "aaabbbcccccddddeeeeeeee";// assigned to each those letters
        String longest ="";
        String each = ""; // each has this aaa
        for(int i = 0; i <str.length()-1; i++){
            each += str.charAt(i); // adds the characters a index i so the string eac.

            if(i == str.length()-1 ||str.charAt(i) != str.charAt(i + 1)) { //if the current character is not equal to the next character

                if(each.length()> longest.length()){
                    longest =each; // if you find a longer substring. assign it to the longest variable
                }
                each = ""; // resetting for the next part/letter
            }}
        System.out.println(longest);
    }}

