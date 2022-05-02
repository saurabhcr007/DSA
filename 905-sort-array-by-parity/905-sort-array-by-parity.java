class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for (int k : nums) {
            if (k % 2 == 0) {
                res[i++] = k;
            } else {
                res[j--] = k;
            }
        }
        return res;
    }
}