package day11_if_Statements.Assignments;

public class Grade {
    public static void main(String[] args) {

        int score =89;

        if(score >= 75) {
            System.out.println("Passed");

            if (score > 92) {
                System.out.println(" You did realy well");

            }else if(score >80) {
                System.out.println("Good Job");

            }else{
                System.out.println(" Not bad");
            }


        }else {
            System.out.println("failed");

        }   if(score>50) {
            System.out.println("Try harder");

        } else{
            System.out.println("Keep Studying");
        }
    }
}
