package day39_inheritance.access.a;

public class RunnerA {
    public static void main(String[] args) {
        //Q: What did I inherit, what do I have access to?
        Condo condo = new Condo();
        condo.address ="132 l";
        condo.city =" Chicago";
        condo.state ="IL";// is inherited because we are in the same package
        //condo.zipcode = zipcode was private so it doesnt inherit
    }
}
