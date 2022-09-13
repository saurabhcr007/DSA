class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hcontain=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hcontain.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}