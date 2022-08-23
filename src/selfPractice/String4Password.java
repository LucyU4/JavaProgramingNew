package selfPractice;

public class String4Password {
    /*
    Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password
     */
    public static void main(String[] args) {


        String password = "Claire123@$";
        System.out.println(password);// original value
        System.out.println(password.equals("CLAIRE123@$"));//
        password = password.toLowerCase();
        System.out.println(password.equals("claire123@$"));// false because this password is written in lower case
        System.out.println(password.equalsIgnoreCase("Claire123@$"));// true

    }

}
