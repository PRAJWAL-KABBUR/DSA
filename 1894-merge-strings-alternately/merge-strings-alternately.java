class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        
        int i = 0, j = 0;
        
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        
        // If word1 is longer
        if (i < word1.length()) {
            result.append(word1.substring(i));
        }
        
        // If word2 is longer
        if (j < word2.length()) {
            result.append(word2.substring(j));
        }
        
        return result.toString();
    }
}