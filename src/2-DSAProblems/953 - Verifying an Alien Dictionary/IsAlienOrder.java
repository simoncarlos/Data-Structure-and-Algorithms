import java.util.ArrayList;
import java.util.HashMap;

public class IsAlienOrder {
    private static HashMap<String, Integer> ABCValues = new HashMap<>();

    public static boolean bucle(String word1, String word2){
        int letterWord1 = 0;
        int letterWord2 = 0;
        int length = 0;
        if(word1.length() > word2.length()) length = word2.length();
        else length = word1.length();
        for (int i = 0; i < length; i++) {
            letterWord1 = ABCValues.get(String.valueOf(word1.charAt(i)));
            letterWord2 = ABCValues.get(String.valueOf(word2.charAt(i)));
            if(letterWord1 > letterWord2) return false;
            if(letterWord1 < letterWord2) return true;
        }
        if( word1.length()> word2.length()){
            return false;
        }
        return true;
    }

    public static boolean isAlienSorted(String[] words, String order) {
        
        for (int i = 0; i < order.length(); i++) {
            ABCValues.put(String.valueOf(order.charAt(i)), i);
        }
        
        for (int i = 0; i < words.length -1; i++) {
            if(!bucle(words[i], words[i+1])) return false;
        }
        return true; 
    }
    public static void main(String args[]){
        /* 
            ["hello","leetcode"]    "hlabcdefgijkmnopqrstuvwxyz"
            ["word","world","row"]  "worldabcefghijkmnpqstuvxyz"
            ["apple","app"]         "abcdefghijklmnopqrstuvwxyz"
            ["kuvp","q"]            "ngxlkthsjuoqcpavbfdermiywz"
        */
        String[] words = { "kuvp","q" }; 
        String order = "ngxlkthsjuoqcpavbfdermiywz" ;
        System.out.println(isAlienSorted(words, order));
    }
}
