package day11_if_Statements.Assignments;

public class ArmyQualifications {
    public static void main(String[] args) {
        /* ages: 18- 35
        high school diploma
        citizen
         */

        int age = 17;
        boolean hasDiploma = true;
        boolean isCitizen = true;

        if ((age >= 18 && age <= 35) && hasDiploma && isCitizen) {
            System.out.println("You Qualify for the Army");
        } else {
                  // multibranch is to give information about the age
            if (age < 0 || age > 120) { // checks for valid age numbers first
                System.out.println("Not a valid age number");
            } else if (age < 18) {
                System.out.println("Your are too young, need to be at east 18");
            } else if(age>35){
                System.out.println("You are too old, the limit is 35 years old");
            }
                      // if to check about diploma
            if (!hasDiploma) { // if you dont have a diploma then;
                System.out.println(" You need at least High school diploma");
            }
                  // if to check about the citizenship
            if (!isCitizen) {
                System.out.println("You need to be a citizen to apply");
            }
        }
    }
}