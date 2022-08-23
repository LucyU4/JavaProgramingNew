package selfPractice;
public class LoopPrimNumber {
    public static void main(String[] args) {
        /*
        [IQ] Prime number
Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		11
	Output:
		prime
Ex:
	Input:
		10
	Output:
		not prime
         */

        int num = 11;
        boolean prime = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                prime = true;
                break;
        }}
           if (!prime)
            System.out.println(num + " is a prime number.");

            else
        System.out.println(num + " is not a prime number.");
    }}