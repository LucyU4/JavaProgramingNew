package day_41_exceptions.person;

public class Runner {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Lucy");
        obj.setAge(41);
        System.out.println(obj);


        Person obj2 = new Person();
        obj.setAge(-30);
        System.out.println(obj2);



    }
}
