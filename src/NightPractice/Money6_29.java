package NightPractice;

import java.util.Scanner;

public class Money6_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();


        int hours = time/3600;
        int minutes = time%3600 / 60;
        int seconds = time % 3600 %60;

        System.out.println(hours + "hours\n" + minutes + ": minutes\n" + seconds + ": seconds");

    }
}
