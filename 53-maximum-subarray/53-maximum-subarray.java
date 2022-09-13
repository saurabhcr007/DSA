class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int i;
        int sum=0;
        if(nums.length==1) return nums[0];
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }     
        }
        return max;
    }
}