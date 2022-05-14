class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int s=0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                s=nums[i];
            } else {
                map.put(nums[i], 1);
            }
        }
        return s;
    }
}