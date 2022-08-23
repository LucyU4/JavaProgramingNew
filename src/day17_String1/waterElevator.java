package day17_String1;

public class waterElevator {

    public static void main(String[] args) {
        String str = "water";

        if(str.length()%2 ==1) {
            int midIndex = str.length() / 2;
            System.out.println("The middle character: " + str.charAt((midIndex)));

        }else{
            //str has an even number of characters, so 2 middle char
            //elephant length 8/2 = 4

            //01234567 length 9/2

            int first = str.length()/2 -1;
                    int second = str.length()/2;

            System.out.println("The middle characters are " + str.charAt(first) + str.charAt(second));
            System.out.println("The middle characters are" + str.substring(first, second +1));
        }

    }
}
