package JavaConcepts;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamsApi {
    // API for operate on the collections or lists
    // Compose by the data entry -> intermediate operation -> final operation -> result
    // intermediate operations are optionals but the final operations are a must
    public static void main(String args []){
        
        List<String> listNames = List.of("Ana", "Juan", "Pedro", "Maria", "Julia");
        
        List<String> namesA = lista.stream().filter(n-> n.contains("a") || n.contains("A")).collect(Collectors.toList());
        //List<String> namesA = lista.stream().filter(n-> n.contains("a") || n.contains("A")).toList(); -> Java 9+

        List<String> namesUpper = listNames.stream().map(String::toUpperCase).toList();

        int totalLetters = listNames.stream().map(String::length).reduce(0, Integer::sum);

        // Parallel Streams process element in multiple threads

        int totalLetters2 = listNames .parallelStream().map(String::length).reduce(0, Integer::sum);

    }
}
