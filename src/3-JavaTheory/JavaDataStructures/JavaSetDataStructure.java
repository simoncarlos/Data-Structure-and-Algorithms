package JavaDataStructures;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetDataStructure {
    /*
        Unless the List, the Set doesn't preserve the order of the elements
        No index based access
        No repeat elemnts.
    */
    public void setDS(){
        // Store unique elements without guarantee order
        Set<Integer> myObj = new HashSet<Integer>(); // It will implement only the functions of Set
        HashSet<Integer> myObj2 = new HashSet<Integer>();
        TreeSet<Integer> myObj3 = new TreeSet<Integer>();
    }
    public void hashSetDS(){
        // Store unique element without any order
        HashSet<Integer> myObj = new HashSet<Integer>();
        myObj.add(1);
        myObj.contains(1);
        myObj.remove("1");
        for (Integer element : myObj) {
            
        }
    }
    public void treeSetDS(){
        //Store unique elements in sorted order
        TreeSet<Integer> myObj = new TreeSet<Integer>();
        myObj.add(1);
        myObj.size();
        myObj.remove(0);
        myObj.contains(1);
        myObj.clear();
    }
    public void linkedHashSetDS(){
        //Store unique elements following the insertion order but more slower than Hash Set
        LinkedHashSet<Integer> myObj = new LinkedHashSet<Integer>();
        myObj.add(1);
        myObj.remove(0);
        myObj.size();
        myObj.contains(0);
        myObj.clear();
    }
}
