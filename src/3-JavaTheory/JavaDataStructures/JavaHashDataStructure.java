package JavaDataStructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaHashDataStructure {
    /* 
        The Map Types always store a pair of Keys-Values where the keys never repeats
        More efficient for acces to the value if you know the key.
        There could be repeated values with different keys
    */
    void mapDS(){
        Map<Integer, Integer> myObj = new HashMap<> ();
        Map<Integer, Integer> myObj2 = new TreeMap<>();
        Map<Integer, Integer> myObj3 = new LinkedHashMap<>();
    }
    void HashMapDS(){
        // Store pair of Key-Values without sorted order 
        HashMap<String, Integer> myObj = new HashMap<>();
    }
    void TreeMapDS(){
        // Store pair of Key-Values with a sorted order for Keys
        TreeMap<String, Integer> myObj = new TreeMap<>();
    }
    void LinkedHashMap(){
        // Store pair of Key-Values with the insertion order
        LinkedHashMap<String, Integer> myObj = new LinkedHashMap<>();
    }
    
}
