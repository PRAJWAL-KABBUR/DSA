public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }
        
        // Step 2: Suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        
        return answer;
    }

    // Test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = sol.productExceptSelf(nums1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = sol.productExceptSelf(nums2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
