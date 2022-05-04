class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int count=0;
        int sum=0;
        for (int i = 0; i < n;) {
            sum=nums[i]+nums[n];
            if(sum==k){
                count++;
                n--;
                i++;
            }
            else if(sum>k){
                n--;
            }
            else{
                i++;
            }
        }
        return count; 
    }
}