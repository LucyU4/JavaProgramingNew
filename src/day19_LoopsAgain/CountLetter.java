package day19_LoopsAgain;

public class CountLetter {

    //frequency
    // word -> java
    // how many 'a' chars?
    public static void main(String[] args) {


        String word = "banana";
        int count = 0;

        for (int i = 0; i < word.length(); i++) { // i <= word.length()-1
            if (word.charAt(i) == 'a') {
                count++;

            }
        }
        System.out.println(count);
    }
}