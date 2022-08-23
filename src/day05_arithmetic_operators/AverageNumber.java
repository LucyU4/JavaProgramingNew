package day05_arithmetic_operators;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class AverageNumber {
//create a class AverageNumber, and write a program that will define 4 scores and find the average of the scores

    public static void main(String[] args) {

        double score1 = 96.5;
        double score2 = 87.3;
        double score3 = 75.4;
        double score4 = 71.6;

        double averageOfScore = score1 + score2 + score3 + score4/4;

        System.out.println(" The Average Score " + averageOfScore);

    }

}
