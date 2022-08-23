package NightPractice;

public class CreateID {
    /*
    [Create ID]
Given a first name and last name create and return an id using the
following format:
the first letter of the first name as lowercase,
the first 3 letters of the last name with the first letter as
uppercase and the rest lowercase,
the length of the first String multiplied by 2
first name: john
last name: smith
id: jSmi8
     */
    public static void main(String[] args) {
        String firstName = "john";
        String lastName = "smith";
        int id = firstName.length()*2;
        firstName = firstName.substring(0,1).toLowerCase();
        lastName =lastName.substring(0,1).toUpperCase() +  lastName.substring(1,3).toLowerCase();

        System.out.println(firstName + lastName +id);


    }
}
