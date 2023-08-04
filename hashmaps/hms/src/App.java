import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //country, popln
        HashMap<String, Integer> hm = new HashMap<>();


        // Inserting elements
        hm.put("India", 120);
        hm.put("US", 60);
        hm.put("China", 100);
        System.out.println(hm);

        hm.put("China", 180);

        System.out.println(hm);

        // Search Operation
        if(hm.containsKey("China")) {
            System.out.println("key present");
        }
        else {
            System.out.println("not present");
        }

        // get function
        System.out.println(hm.get("China")); // --> key exists and returns value for the given key
        System.out.println(hm.get("Bangladesh")); // --> doesn't exist so returns a "null"

        int arr[] = {12, 15, 18};
        for (int val: arr) {
            System.out.println(val);
        }

        // Iteration 1
        for ( Map.Entry<String, Integer> e: hm.entrySet()) {
            System.out.print(e.getKey() + ": ");
            System.out.println(e.getValue());
        }

        // Iteration 2
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " " + hm.get(key));
        }

        // Removal
        hm.remove("China");
        System.out.println(hm);

    }
}


