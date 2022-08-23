package day16_string;

public class EmailBr {
    public static void main(String[] args) {

        /*
        saim@ydeo.com
        name -> saim
        domain -> cydeo

         */
        String email = "bruce@wayneetterprice.net";
        int indexOfAt = email.indexOf('@');
        String name = email.substring(0, indexOfAt);
        int indexOfDot = email.indexOf('.');
        String domain = email.substring(indexOfDot + 1, indexOfDot);


        System.out.println("Full email: " + email);
        System.out.println("NAme part: " + name);
        System.out.println("Domain part:" + domain);

    }
    }