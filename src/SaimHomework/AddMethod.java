package SaimHomework;

public class AddMethod {
    public static void main(String[] args) {

    /*
    create a method that can print odd numbers between 1-100 in the
same line separated by space

     */
    int num = 100;
	System.out.print("Odd Numbers from 1 to "+num+" are: ");
	for (int i = 1; i <= num; i++) {
        if (i % 2 != 0) {
            System.out.print(i + " ");
        }
    }}}



