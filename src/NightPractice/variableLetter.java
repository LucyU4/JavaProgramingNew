package NightPractice;

public class variableLetter {
    //create a char variable letter. Find and print if the character is a letter, number, or special character
    //
    //	ex: p
    //		letter
    //	ex:
    //		6
    //		number
    //	ex:
    //		$
    //		special character
    public static void main(String[] args) {

        char letter = '$';
        if (letter == 'A' && letter <= 'Z') {
            System.out.println("Letter");
        }

       if(letter == '$'  && letter <= 'Z' ) {
           System.out.println("Special Chracter" + letter);
       }
        if(letter == '0' && letter == '9'){
        System.out.println("number" + letter );

}
    }
}
