package day42_abstraction.person;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkPlace {

    public static void main(String[] args) {
        // cannot create objects of the Abstract classes
        // Person obj = new Person();
        //Employee obj2 = new Employee();

        Tester Lucy = new Tester("Lucy", 42,  " SDET ", 120_000);
        System.out.println(Lucy);

        Lucy.sleep(8);
        Lucy.work();

        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(Lucy);
        testers.addAll(Arrays.asList(
                new Tester("Bato", 30, "SDET", 150000),
                new Tester("Jonathan", 40, "Senior SDET", 200000),
                new Tester("Isa", 30, "SDET", 180000),
                new Tester("Nasiba", 25,  "SDET", 120_000),
                new Tester("Nargiz", 27, "Qa engineer ", 120000)
        ));

        System.out.println();

        for(Tester each : testers){
            System.out.println(each);

            each.sleep(8);
            System.out.println();
        }

    }
}




