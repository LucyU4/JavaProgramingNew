package NightPractice;

import java.util.Scanner;

public class Night25IfStatement {

    //create an int value for the time of the day. Use a 24 hour format
//use the given time of day to display a message
//hint: use seperate if statements

    //if the hours are from 6 - 11, print: Good morning
    //if the hours are from 12 - 16, print: Good evening
    //if the hours are from 17 - 23 or 0 - 5, print: Good night;
    public static void main(String[] args) {

        Scanner B = new Scanner(System.in);
        System.out.println("Please enter your time");
        int time = B.nextInt();
          if(time <= 11 && time >=6){
        }
if (time >= 12 && time <= 16) {
    System.out.println(" Good evening");
}
    if(time>= 17 && time <=23) {
        System.out.println("Good Night");
    }
        if (time >=0 && time <= 5){
        System.out.println("Good mid night");
        }
    if (time < 0 || time < 23){
        System.out.println("Please enter between 0 -23");


}
    }
}