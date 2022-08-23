package day11_if_Statements.Assignments;

public class LoanProgram {
    //create a class Loan
    //declare and assign a credit score variable
    //try to use ternary to determine of you are eligible for a loan
    //you are eligible if you have a credit score of 700 or above
    //if you are eligible print "loan approved"
    //otherwise print "loan rejected. Sign up for our credit program"

    public static void main(String[] args) {

        double creditScore =800;
        String result = creditScore > 700? " Loan Approved" : " Loan rejected. Sign up for our credit program";
        System.out.println(result);
        // if the boolean credit > is 700 is checked
        //if the boolean is true the value before the colon i returned: loan approved
       // if the boolean is false the value after the colon is returned : Sign up for our credit program
    }
}
