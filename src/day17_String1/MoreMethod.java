package day17_String1;

public class MoreMethod {

    public static void main(String[] args) {
        String  s ="hello";
        System.out.println(s.isEmpty());

        String s2 = " "; // space char
        System.out.println(s2.isEmpty());
        String s3 = " "; // empty space, String but no characters" +
        System.out.println(s3.isEmpty());

        //isBlank method

        String a = "  ";// spaces are character
        System.out.println(a.isEmpty());// checks if there is characters
        System.out.println(a.isBlank());// checks for not space characters

        String b = "h     ";
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());

        String c = " ";
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());

//replace method--.> it finds with certain charater and defining
        String str = "java";
        str = str.replace('a', 'z' );
        System.out.println(str);

        // common use case: delete spaces.

        String str3 = "  multiple words here  ";
        str3 = str3.replace( " ",  "");
        System.out.println(str3.trim());// ge rid of all the spaces
        System.out.println(str3);

        //remove only first
        String z = " Wooden spoon";
        System.out.println(z.replace("o", "-"));
        System.out.println(z.replaceFirst("o", "-"));



        String str2 = "a apple path";
        System.out.println(str2.replace("a","(a)"));

        // how to replace middle character only

        String ex = "wooden spoon";
        int firstO = ex.indexOf('O');
        int secondO = ex.indexOf('O', firstO + 1);
        System.out.println(ex.substring(secondO,secondO));
        System.out.println(ex.substring(secondO).replaceFirst("o","-"));
        System.out.println(ex.substring(0, secondO) + ex.substring(secondO).replaceFirst("O", "-"));



    }
}
