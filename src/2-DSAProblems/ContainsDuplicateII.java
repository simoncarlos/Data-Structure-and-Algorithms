import java.util.HashSet;

public class ContainsDuplicateII{
    public static void main(String[] args){
        int[] array = {1,9,10,1000,2,1,3,4,5,7,8};
        int k= 4;
        boolean result = false;

        HashSet<Integer> copy = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if(copy.contains(array[i]) ){
                result = true;
                break;
            }
            copy.add(array[i]);
            if(copy.size() > k){
                copy.remove(array[i-k]);
            }
        }
        System.out.println("El valor de result es: " + result);
    }
}