package JavaDataStructures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class JavaListDataStructure {

    /* 
        The ArrayList is part of the Collection Framework of JAVA
    */
    void ListProperties(){
        List<Integer> lista = new ArrayList<Integer>(); // If we declare lista like a List<>, the variable will implement only the functions of the interface List
        ArrayList<Integer> list = new ArrayList<Integer>(); // In this instance, "list" will have the List functions and ArrayList functions too
        LinkedList<Integer> linkedlist = new LinkedList<>(); // In this instance, "linkedList" will have the List functions and the LinkedList functions too
    }

    void ArrayListProperties(){
        // Better for access to elements by index but not for add elements, it always create a new arraylist for add elements because of the contiguous memory
        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add(0, "element"); // -> add elemento to the index position, if is not declare it will be the last position
        lista.size(); // -> int
        lista.get(0); // -> position
        lista.remove(0); // -> position
        lista.clear(); // -> clear all the elements
        lista.contains("hola");
        // For access all the elements: 
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i);
        }
        for (String element : lista) {
            System.out.println(element);
        }
        Collections.sort(lista);
    }

    void LinkedListProperties(){
        // Better for add elements, is only necesary to change a pointer reference in one node for create it
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.getFirst();
        linkedList.getLast();       
        linkedList.removeFirst();
        linkedList.removeLast();
    }

    public static void main(String args[]){

    }
}
