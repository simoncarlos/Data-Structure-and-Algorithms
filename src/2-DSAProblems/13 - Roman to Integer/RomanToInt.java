import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    private static final Map<Character, Integer> romanValues = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    );
    static public int romanToInt(String s) {
        
        int last = 0;
        int accum = 0;

        for (int i = s.length() -1 ; i >= 0; i--) {
            char letter = s.charAt(i);
            int value = romanValues.get(String.valueOf(letter));

            if(value >= last){
                accum += value;
            }else{
                accum -= value;
            }
            last = value;
        }

        return accum;
    }

    public static void main(String args[]){
        System.out.println(romanToInt("XXVVIII"));
    }
}

