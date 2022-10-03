package day48_maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Season {
    public static void main(String[] args) {
        //avg temp each season

        Map<String, Double> temperature = new HashMap<>();
        temperature.put("summer", 85.0);
        temperature.put("fall", 68.0);
        temperature.put("winter", 40.0);
        temperature.put("spring", 65.0);
        System.out.println(temperature);


        temperature.put("summer", 87.1);
        System.out.println(temperature);
        System.out.println("Average for winter" + temperature.get("winter"));
        System.out.println("Average for winter" + temperature.get("spring"));

        System.out.println(temperature.containsKey("mid summer"));
        System.out.println(temperature.containsValue(100.0));

        // are there any duplicate value
        System.out.println(temperature.values());
        int before = temperature.values().size();
        int after = new HashSet<>(temperature.values()).size();

        System.out.println(before == after ? "No duplicate" : "Duplicate values");
        //find the average  temperature for all season
    }

    public static double avgTemp(Map<String, Double> map) {
        double average = 0;
        for (double eachTemp : map.values()) {
            average += eachTemp;

        }
        return average / map.size();
    }
}
