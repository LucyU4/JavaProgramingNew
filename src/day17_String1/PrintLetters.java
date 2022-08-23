package day17_String1;

public class PrintLetters {


    public static void main(String[] args) {
        char first = 'A';

        while (first <= 'Z') ;
        System.out.println(first++);
        System.out.println();
        // pritning z-a
        char backwards = 'z';
        while (backwards >= 'a') {
            System.out.println(backwards--);
            System.out.println();
        }
    /*
    iteration 1:
    first = 'A'
    'A' < 'Z' true
    loop runs
    prints (first) -> A
    then increments because of post increment
    first ++ -> B


    iteration 2:
    first = B
    B<Z
    loop

     */
    }}