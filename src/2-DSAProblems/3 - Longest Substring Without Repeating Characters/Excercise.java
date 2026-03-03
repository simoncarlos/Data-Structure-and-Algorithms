/* 
    Given a string s, find the length of the longest substring without duplicate characters.

    Example 1:
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
    
    Example 2:
    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
    
    Example 3:
    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
    
    Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String wordSecuence = "";
        int maxium = 0;
        for (char letter : s.toCharArray()) {
            if (wordSecuence.indexOf(letter) != -1) { // -> existe
                wordSecuence = wordSecuence.substring(wordSecuence.indexOf(letter)+1);
            } 
            wordSecuence = wordSecuence.concat(String.valueOf(letter));
            if (wordSecuence.length() > maxium)
                maxium = wordSecuence.length();
        }
        return maxium;
    }
}

/*
    String palabra = "asdaamjnbhasjdas"
    String word = "";
    int maxium = 0;
    FOR letra
    if word.contains(letra){
    posicion = busco posicion mas chica de la letra
    elimino el contenido del word 
    } 
    word = word.concat(letra)
    if(word.length > maxium) maxium = word.length
    
    return maxium;
 
 */