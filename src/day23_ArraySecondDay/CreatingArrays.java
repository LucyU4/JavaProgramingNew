package day23_ArraySecondDay;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {
    /*
    define persons information
    0 -> id
    1-> first name
    2->last name
    3-> batch num
     */
    // have al the information
    public static void main(String[] args) {


        String[] studentOne = {"04", "Kristina", " Gaidamociv", "27"};
        System.out.println(Arrays.toString(studentOne));
        // know the number of elememts, but not the values yet
        String[] studentTwo = new String[4];
        studentTwo[0] = "10";
        studentTwo[1] = "Olena";
        studentTwo[2] = "Kravetska";
        studentTwo[3] = "27";
        System.out.println(Arrays.toString(studentTwo));

        //know the number of elements, and add from Scanner
        Scanner input = new Scanner(System.in);
        String[] studentThree = new String[4];
        System.out.println("Enter your id");
        studentThree[0] = input.next();
        System.out.println("Enter your first name");
        studentThree[1] = input.next();
        System.out.println("Enter your first name");
        studentThree[2] = input.next();
        System.out.println("Enter your batch number");
        studentThree[3] = input.next();
        System.out.println(Arrays.toString(studentThree));


// most dynamic
        String[] studentFour = new String[4];
        String[] questions ={"id", "first name", "last name", "batch number" };
        for (int i = 0; i < studentFour.length; i++) {
            studentFour[i] = input.next("enter your " + questions[i]);// printing a dynamic message based on questions defined in the question elements.
            studentFour[i] = input.next();// strong the scanner input from the console into the array at index i
        }
        System.out.println(Arrays.toString(studentFour));

        }
    }