class Solution {
    public int maxVowels(String s, int k) {
        int count = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            // add current character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // remove character going out of window
            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;
            }

            // update max after window reaches size k
            if (i >= k - 1) {
                max = Math.max(max, count);
            }
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
