import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSecuency {

    private static Set<Integer> consecutive = new HashSet<>(); 
    
    public static int longestConsecutive(int[] nums) {
        
        for (int i : nums) {
            consecutive.add(i);
        }

        int max = 0;
        
        int last = Integer.MIN_VALUE;
        int counter = 1;
        for (Integer element : consecutive) {

            if(element == (last+1)){
                counter++;
            }else{ 
                counter=1;
            }
            last = element;
            if(counter > max) max = counter;
        }

        return max;
    }
    public static void main (String args[]){
        int[] nums = { 100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
