package day43_abstraction.learning;

public class Desktop implements Mac{

    @Override
    public void tunOn() {
        System.out.println("Desktop is turning on");
    }
}
