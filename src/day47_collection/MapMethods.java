package day47_collection;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<Character, Integer> gradeScale = new HashMap<>();
//adding to map:put()
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);
        gradeScale.put('z',1000);
        gradeScale.put('Z',3000);//using put a key that is already in the map,will update the value
        //reading from a map:

        System.out.println(gradeScale);

        System.out.println(gradeScale.get('B'));
        System.out.println(gradeScale.get('b'));

        //removing from a map: remove()
        gradeScale.remove('Z');
        System.out.println(gradeScale);

        //contains in a map

        System.out.println(gradeScale.containsKey('C'));
        System.out.println(gradeScale.containsKey('c'));

        System.out.println(gradeScale.containsValue(100));
        System.out.println(gradeScale.containsValue(90));






    }
}
