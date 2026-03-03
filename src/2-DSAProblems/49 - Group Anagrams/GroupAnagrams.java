import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] wordListParam = { "tscon", "const", "let", "rav", "tel"};
        Map<String, List<String>> wordValue = new HashMap<>();
        int[] chartCounts = new int[26];
        for (int i = 0; i < wordListParam.length; i++) {
            Arrays.fill(chartCounts, 0);
            StringBuilder key = new StringBuilder("");
            for (int j = 0; j < wordListParam[i].length(); j++) {
                chartCounts[wordListParam[i].charAt(j) - 'a']++;
            }
            for (int j = 0; j < chartCounts.length; j++) {
                key.append("#");
                key.append(chartCounts[j]);
            }
            String keyValue = key.toString();
            if(!wordValue.containsKey(keyValue)){
                wordValue.put(keyValue,new ArrayList<>());
            }
            wordValue.get(keyValue).add(wordListParam[i]);
            
        }
        System.out.println("El resultado es: " + new ArrayList<>(wordValue.values()));

    }
}
