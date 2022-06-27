class Solution {
    public int pivotIndex(int[] nums) {
        int x=0;
        int y=0;
        for (int i = 0; i < nums.length; i++) {
            y=y+nums[i];
        }
        y = y-nums[0];
        if(y==0)
            return 0;
        for (int i = 1; i < nums.length; i++) {
            x=x+nums[i-1];
            y=y-nums[i];
            if(x==y){
                int z=i;
                return z;
            }
            
        }
        return -1;
    }
}