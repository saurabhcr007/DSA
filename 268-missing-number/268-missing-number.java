class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int base;
        int sum = 0;
        if(n%2 == 0)
        {
            base =n/2;
        }
        else 
        {
            base = (n+1)/2;
        }
        for(int i=0;i<n;++i)
        {
            sum = sum + base - nums[i];
        }
        if(n%2 == 0) 
        {
            sum += base;
        }
        return sum;
    }
}