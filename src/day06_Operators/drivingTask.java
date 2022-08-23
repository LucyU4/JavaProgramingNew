package day06_Operators;

public class drivingTask {

    public static void main(String[] args) {
        /*
        declare a speed variable
        speed limit is 50
        find out if you are speeding
        true/false
         */
        int currentSpeed =45;
        int speedLimit = 50;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Is speeding: " + isSpeeding);

        /*
        declare a number variable
        find out if the number is postitive, negative or zero
        */
int number = -4;
boolean isPostive = number > 0;
boolean isNegative =number < 0;
boolean isZero = number == 0;
        System.out.println("isPositve = " + isPostive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " +  isZero);
        System.out.println();


    }
}
