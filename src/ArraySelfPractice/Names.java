package ArraySelfPractice;

public class Names {
    public static void main(String[] args) {
        String [] names = {"James Bond", "Harry Potter", "Tony Stark"};

        System.out.print(names[0].charAt(names[0].length()-10)+".");
        System.out.println(names[0].charAt(names[0].length()-4)+ " ");

        System.out.print(names[1].charAt(names[1].length()-12)+".");
        System.out.println(names[1].charAt(names[1].length()-6)+ " ");

        System.out.print(names[2].charAt(names[2].length()-10)+ ".");
        System.out.println(names[2].charAt(names[2].length()-5)+ " ");

    }
}
