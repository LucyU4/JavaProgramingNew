package day17_String1;

public class jamesBond {

    public static void main(String[] args) {
        String name1 ="James Bond";//nextLine()
        String name2 = "Jamie Bond";// nextLine()

        int indexOfSpace = name1.lastIndexOf(' ');
        String lastName = name1.substring(indexOfSpace + 1); // name1.substring(indexOfSpace).trim();

        if(name2.endsWith(lastName)) {
        }else {
            System.out.println("Not Related");
            System.out.println(name2.endsWith(lastName)? "Related" : "Not Relaed");




        }
    }
}
