package day06_Operators;

public class CharIncrement {

    public static void main(String[] args) {
        char letter = 'A';
        System.out.println(letter++ );
        System.out.println(letter++);
        System.out.println(letter++ );
        System.out.println(letter++ );
        System.out.println();

        char letter2 = 'a';
        System.out.println(++letter2);// pre increment, so the 1 is added first, then the expression finishes
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println();

        char digits= '9'; // this is the character 9, the digits, not the number
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits);// this is printing the character
        System.out.println((int)digits);// cast the character to an int, which mean that is prints the ascii number for that charcter

        System.out.println(65);
        System.out.println((char)65);



}
    }