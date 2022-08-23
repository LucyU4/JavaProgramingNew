package day37_static.school;

public class Executions {
    public static void main(String[] args) {
        new Executions();
        System.out.println(1);
        new Executions();
        new Executions();
    }
    public Executions(){
        System.out.println(2);
    }
    static {// this block is run first,(only once) whenever the class is loaded(used)
        System.out.println(3);
    }
}
