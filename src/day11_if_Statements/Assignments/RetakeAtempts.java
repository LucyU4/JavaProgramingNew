package day11_if_Statements.Assignments;

public class RetakeAtempts {

//create a class Retake
//
//declare and assign a grade variable
//declare and assign an attempt number
//
//Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
//
//	If it's the first attempt -> subtract 10%
//	If it's the second attempt -> subtract 20%
//	If its the third attempt -> subtract 35%
//
//Based on the retake attempt number calculate the final grade

    public static void main(String[] args) {

        double grade = 80;
        int attemptNumber =2;
        double finalGrade =0;

        if (attemptNumber ==1) {
            finalGrade = grade * 0.9; // 90% of grade, which is minus 10%
        }else if (attemptNumber==2){
            finalGrade = grade * 0.8; // 80% of grade, which is minus 10%
        }else if (attemptNumber==3){
            finalGrade = grade * 0.65; // 65% of grade, which is minus 35%
        }
        // grade - grade *10%
        System.out.println(finalGrade);
    }
}