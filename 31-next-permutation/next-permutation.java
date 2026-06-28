class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //1: pivot find
        int i = n - 2;
         while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
         }
        //2: next greater element and swap
         if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
         }
        //3: reverse the suffix
    reverse(nums, i + 1, n - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}