class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int i;
        int dp[] = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for(i=2 ; i<cost.length+1 ; i++){
            dp[i] = Math.min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1]);
        }
        return dp[cost.length];   
    }
}