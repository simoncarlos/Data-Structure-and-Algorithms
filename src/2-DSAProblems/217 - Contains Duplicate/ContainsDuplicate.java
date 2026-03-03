import java.util.HashSet;
public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        boolean result = false;
        HashSet <Integer> map = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if(map.contains(array[i])){
                result = true;
                break;
            }
            map.add(array[i]);
        }
        System.out.println("El valor de result es: " + result);
    }
}