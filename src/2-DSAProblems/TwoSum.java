import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {1,3,7,2,6,5};
        int target = 10;
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if(map.containsKey(complement)){
                result = new int[]{map.get(complement), i};
                break;
            }
            map.put(array[i], i);
        }
        System.out.println("El resultado de los indices son: " + result);
    }
}

