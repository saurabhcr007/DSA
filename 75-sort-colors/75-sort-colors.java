class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        for (int k = 0; k <= j; k++) {
            if (nums[k] == 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
            } else if (nums[k] == 2) {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j--;
                k--;
            }
        }
    }
}