      package day09_ifStatement;

      import java.util.Scanner;

      public class ScannerSurvey {
      public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          System.out.println("Are you a student? T?F");
          boolean isStudent = input.nextBoolean();
          String report = ""; // empty space, no character yet it's still is a string type

          if (isStudent) {
              System.out.println("What are you studying?");
              String subject = input.next();
              System.out.println(subject);
              // report + = " Studying: " + subject;

          }
          System.out.println("Do you live in a city? T/F");
// if you put boolean inCity = input.nextBoolean;
          //if(inCity)
          if (input.nextBoolean()) { // using the boolean from scanner right away instead of storing into a boolean variable
              System.out.println(" Cool, cities are loud and fun");

          } else {

              System.out.println("How many years have you lived in the suburb?");
              int years = input.nextInt();
              System.out.println(years);
              // report + = "\nLiving in suburb for " + years + " years";

            //  System.out.println(report);

          }
      }
        }

        // +=
      //  int a= 9;
      // a += 5;
      // a= a + 5;
      //String
