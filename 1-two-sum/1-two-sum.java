
class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        int ans[] = new int[2];
        Map <Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target - nums[i])){
                ans[0] = hash.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            hash.put(nums[i],i);
        }
        return ans;
    }
}