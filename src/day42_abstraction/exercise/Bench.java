package day42_abstraction.exercise;

public class Bench extends Lifting{

    @Override
    public void perform() {

    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(10 * minutes);
    }

    @Override
    public void rackWeights() {
        System.out.println("Putting the bar back on thr rack");
    }
}
