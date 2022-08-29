package day_41_exceptions.hiding;

public class Person {
    String name = "James Bond";
}
class SecretIdentity extends Person{
    String name = "dnobsemal";// doing variable hiding, the orgoinal one is hiddem but noe I hage a new variable with the same name
}
class Runner{
    public static void main(String[] args) {
        // could I have declares as normal reference then access the variable.Yes but just tp show quickly we made objects without reference
        System.out.println(new Person().name);
        System.out.println(new SecretIdentity().name);
    }
}
