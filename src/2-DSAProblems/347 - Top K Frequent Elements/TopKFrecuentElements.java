import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrecuentElements{
    public static void main(String args[]){
        int[] nums = {1,2,3,4,4,4,2};
        int k = 2;
        
        HashMap<Integer, Integer> repeats = new HashMap<>();
        for(int i:nums){
            repeats.put(i, repeats.getOrDefault(i,0) +1);
        }
        Queue<Integer> cola = new PriorityQueue<>(
            (a,b) -> repeats.get(a)-repeats.get(b));
        for(int entry : repeats.keySet()){
            cola.add(entry);
            if(cola.size() > k)cola.poll();
        }
        int[] result = new int[k];
        for(int i = 0; i<k ; i++){
            result[i]=cola.poll();
        }
        
        System.out.println("Result: " + result);  
    }
}