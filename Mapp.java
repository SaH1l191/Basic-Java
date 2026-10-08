
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Mapp {

    public static void main() {
        Map<String, Integer> mp = new HashMap<>();
        mp.clear();
        mp.put("One", 1);
        mp.put("Two", 2);
        mp.put("Three", 3);
        mp.put("One", 3); //replaces the value of "One"
        // mp.remove("One");
        for (Map.Entry<String, Integer> val : mp.entrySet()) {
            System.out.println(val.getKey() + " : " + val.getValue());
        }
        for (int val : mp.values()) {
            System.out.println(val);
        }
        for (String val : mp.keySet()) {
            System.out.println(val);
        }
        System.out.println("Size of the map: " + mp.size());
        System.out.println("Is the map empty? " + mp.isEmpty());
        System.out.println("does it contain 5? " + mp.containsKey("Five"));
        System.out.println("does it contain 5? " + mp.containsValue(5));
        System.out.println("if 9 then else ? " + mp.getOrDefault("Nine", 9));


        //LinkedHashMap (insertion order is preserved)
        Map<String, Integer>lmap = new LinkedHashMap<>();
        //same methods

        Map<String, Integer> mapp = new TreeMap<>();


    }
}
