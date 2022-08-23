package day29_returnMethod;

import my_utils.StringUtil;

public class DuplicateOfCharacter {
    public static void main(String[] args) {
        System.out.println(getDuplicateCharacters("AAABCCDEEF"));
        System.out.println(getDuplicateCharacters("ISJWJBwwiwqie"));
    }

    public static String getDuplicateCharacters(String str){

        String duplicate = "";

        for(int i = 0; i < str.length(); i++){
            //str.charAt(i) --> give every character

            if(duplicate.contains("" + str.charAt(i))){
                continue;
            }

            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));

            if(frequency > 1){
                duplicate += str.charAt(i);
            }

        }

        return duplicate;
    }

}

/*          String str = AAABCCDEEF
            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));
            StringUtil.frequencyOfChar(str, A);
            StringUtil.frequencyOfChar(str, B);
            StringUtil.frequencyOfChar(str, C);
            StringUtil.frequencyOfChar(str, D);
            StringUtil.frequencyOfChar(str, E);
 */
