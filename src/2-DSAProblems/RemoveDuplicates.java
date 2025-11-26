import java.util.HashMap;

public class RemoveDuplicates{
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int number : nums) {
            if(i==0 | i==1 | nums[i-2] != number){
                nums[i] = number;
                i++;
            }
        }
        return i;
    }

    public static void main(String args[]){
        int[] nums = {1,1,1,2,2,3};
        removeDuplicates(nums);
    }
}