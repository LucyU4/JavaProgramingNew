package day12_Switch;

public class SwitchExample{


    public static void main(String[] args) {

        int day = 3; // number from 1-7, where 1 is monday and 7 is Sunday
              System.out.println(" Not a valid day number, should 1- 7");
        switch(day){

            case 1:// if(day ==1)
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
