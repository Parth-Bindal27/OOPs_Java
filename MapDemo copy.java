import java.util.HashMap;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "96");
        map.put(2, "56");
        map.put(3, "99");
        map.put(4, "91");
        map.put(5, "45");
        System.out.println("HashMap: " + map);
        System.out.println("Size of HashMap: " + map.size());
        System.out.println("Value for key 3: " + map.get(3));
        System.out.println("Contains key 2: " + map.containsKey(2));
        System.out.println("Contains value '45': " + map.containsValue("45"));
        System.out.println("Removing key 4: " + map.remove(4));
        System.out.println("HashMap after removal: " + map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue( ));
        }

        if (map.containsKey(3)) {
            System.out.println("Value for key 3: " + map.get(3));
        } else {
            System.out.println("Key 3 not found in the HashMap.");
        }

        map.put(10, "100");
        System.out.println("HashMap after adding key 10: " + map);

        map.remove(2);
        System.out.println("HashMap after removing key 2: " + map);
    }
}


//HashMap Parent Intergace: Map
//HashTable Parent Intergace: Map
//HashTable to be used in multi-threaded environment
//HashMap to be used in single-threaded environment

//LinkedHashMap Parent Intergace: Map
//LinkedHashMap maintains the insertion order of the elements, while HashMap does not guarantee any specific order.

//Key Set In Sorted Order: TreeMap
//TreeMap Data Structure: Red-Black Tree
//TreeMap Structure to get in sorted order: TreeMap uses a Red-Black tree data structure to store its elements in sorted order based on the natural ordering of the keys or a specified comparator. This allows for efficient retrieval of elements in sorted order, as well as efficient insertion and deletion operations.
