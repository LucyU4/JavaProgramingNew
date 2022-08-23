package NightPractice;

public class RelativeChecker {

        /*
        [Relative checker]
Given two full names check if the two people are related. They will be
considered to be related if they have the same last name
Input:
James Bond
Jamie Bond
Output:
Related
-------------------
Input:
James Bond
Alex Benji
Output:
Not Related
------------------------------------------------------------------------
         */
        public static void main(String[] args) {
            String name1 = "James Bond";
            String name2 = " Jamie Bond";
         String  lastName1 = name1.substring(name1.length()-4);
            System.out.println(lastName1);
            String  lastName2 = name2.substring(name2.length()-4);
            System.out.println(lastName2);

            if (lastName1.equalsIgnoreCase(lastName2)){
                System.out.println("They are related.");
            } else{
                System.out.println(" Not related");
            }



        }
}
