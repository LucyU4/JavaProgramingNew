package NightPractice;

public class FirstWord {
    /*
    [Move first word]
Given a sentence. Display the sentence with the first word moved to the
end of the sentence.
Input:
Java is a fun language
Output:
is a fun language Java
     */
    public static void main(String[] args) {
        String sentence ="Java is a fun language";
        String firstWord = sentence.substring(0,5);
        String sentenceWithOutJava = sentence.substring(5);
        System.out.println(sentenceWithOutJava + " " + firstWord);
    }
}
