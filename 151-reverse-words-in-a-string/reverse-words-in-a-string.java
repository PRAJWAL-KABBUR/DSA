class Solution {
    public String reverseWords(String s) {
       char[] arr = s.toCharArray();
        int n = cleanSpaces(arr);

        reverse(arr, 0, n - 1);

        int start = 0;
        for (int end = 0; end <= n; end++) {
            if (end == n || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr, 0, n);
    }

    // Remove leading, trailing & extra spaces
    private int cleanSpaces(char[] arr) {
        int i = 0, j = 0;
        int n = arr.length;

        while (j < n && arr[j] == ' ') j++;

        while (j < n) {
            if (j > 0 && arr[j] == ' ' && arr[j - 1] == ' ') {
                j++;
                continue;
            }
            arr[i++] = arr[j++];
        }

        if (i > 0 && arr[i - 1] == ' ') i--;

        return i;
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    
    }
}