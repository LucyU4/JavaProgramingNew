package NightPractice;

public class SMS {
    /*
    [SMS parts] - We will do this together
Given a String in the following format:
Sender: <James Bond>. From Number: [202-123-3456]. + Message: {"I love
programming and problem solving"}
Separate these parts and print them separately:
     */
    public static void main(String[] args) {
        String s =  "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";

                String sender = s.substring(s.indexOf('<') + 1 , s.indexOf('>'));
        String number = s.substring(s.indexOf('[') + 1 , s.indexOf(']'));
        String message = s.substring(s.indexOf('{') + 1 , s.indexOf('}'));

        System.out.println("sender: = " + sender);
        System.out.println("number: = " +  number);
        System.out.println("message: = "  +  message);
    }
}
