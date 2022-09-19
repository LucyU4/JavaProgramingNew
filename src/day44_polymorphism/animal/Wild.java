package day44_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {
        //Lizard objects with all references

        Lizard lizard1 = new Lizard();// reference of itself

        //reference of super class

        Reptile lizard2 = new Lizard();

        Animal lizard3 = new Lizard();

        lizard1.eat();
        lizard1.eat();
        lizard3.eat();
    }
}
