package Knowledge.JavaCollections.Maps.LinkedHashMap;

import java.util.*;

/**
 * LinkedHashMapLearn is a Hash table and linked list implementation of the Map interface, with predictable iteration order.
 * This implementation differs from HashMap in that it maintains a doubly-linked list running through all of its entries.
 * This linked list defines the iteration ordering, which is normally the order in which keys were inserted
 * into the map (insertion-order). In last few tutorials we have discussed about HashMap and TreeMap.
 * This class is different from both of them:
 *
 * HashMap doesn’t maintain any order.
 * TreeMap sort the entries in ascending order of keys.
 * LinkedHashMapLearn maintains the insertion order.
 *
 */
public class LinkedHashMapLearn {

    public static void main(String[] args) {
        // HashMap Declaration
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();

        System.out.println("");
        System.out.println("Linked Map");
        System.out.println("");
        //Adding elements to LinkedHashMapLearn
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");

        // Add a new key-value pair only if the key does not exist in the LinkedHashMap, or is mapped to `null`
        lhmap.putIfAbsent(5, "j");
        lhmap.putIfAbsent(5, "k");

        //Replace values
        lhmap.put(99, "Tim");
        lhmap.put(99, "Bull");

        // Generating a Set of entries
        Set set = lhmap.entrySet();

        // Displaying elements of LinkedHashMapLearn
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ me.getKey() +
                    " & Value is: "+me.getValue()+"\n");
        }

        System.out.println("");
        System.out.println("Hash Map");
        System.out.println("");
        HashMap<Integer, String> hmap = new HashMap<>();

        //Adding elements to LinkedHashMapLearn
        hmap.put(22, "Abey");
        hmap.put(33, "Dawn");
        hmap.put(1, "Sherry");
        hmap.put(2, "Karon");
        hmap.put(100, "Jim");

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        hmap.putIfAbsent(5, "j");
        hmap.putIfAbsent(5, "k");

        //Replace values
        hmap.put(99, "Tim");
        hmap.put(99, "Bull");

        // Generating a Set of entries
        Set set2 = hmap.entrySet();

        // Displaying elements of LinkedHashMapLearn
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry me = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+ me.getKey() +
                    " & Value is: "+me.getValue()+"\n");
        }
    }
}
