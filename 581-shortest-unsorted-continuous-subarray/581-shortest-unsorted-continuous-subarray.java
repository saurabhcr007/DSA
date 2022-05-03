class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        int start = -1;
        int end = -2;
        for (int i = 0; i < n; i++) {
            if (nums[i] != copy[i]) {
                start = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != copy[i]) {
                end = i;
                break;
            }
        }
        return end - start + 1;
    }
}