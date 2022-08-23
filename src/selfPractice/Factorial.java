package selfPractice;

public class Factorial {
    public static void main(String[] args) {
        /*
        write a program that calculates a factorial of a number:
        ex.5! =5*4*3*2*1 =120
         */
        int start = 1;
        int end =5;

        int factorial =1;// because if you put zero it will multiply by 0 and result is 0

        while (end>=start){
            factorial *= end;
            end--;
            System.out.println("factorial: " + factorial);


        }
    }


}
