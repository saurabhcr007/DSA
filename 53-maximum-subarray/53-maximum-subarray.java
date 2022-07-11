class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,curr=0;
        for(int i:nums)
        {
            curr+=i;
            if(curr>max) max=curr;
            if(curr<0)  curr=0;
        }
        return max;
    }
}