public class Anagram {
    public static void main(String[] args){
        String value1 = "hola";
        String value2 = "aloh";
        boolean result = true;

        int[] chartCounts = new int[26];

        if(value1.length() != value2.length()) result = false ; 

        for (int i = 0; i < value1.length(); i++) {
            chartCounts[value1.charAt(i) - 'a']++;
            chartCounts[value2.charAt(i) - 'a']--;
        }

        for (int i : chartCounts) {
            if(i!= 0) result = false;               
        }

        System.out.println("El valor de result es: " + result);
    }
}
