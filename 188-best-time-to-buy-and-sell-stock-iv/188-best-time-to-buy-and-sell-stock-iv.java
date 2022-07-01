class Solution {
    private int dp(int[] prices,int x,int k,int stat,Integer[][][] memo){
        if(k<0){
            return 0;
        }
        if(x==prices.length){
            return 0;
        }
        if(memo[x][stat][k]!=null) return memo[x][stat][k];
        int take = 0,notTake = 0;
        int profit = 0;
        if(stat==1){
            take = -prices[x]+dp(prices,x+1,k,0,memo);
            notTake = 0+dp(prices,x+1,k,1,memo);
            profit = Math.max(take,notTake);
        }
        else{
            take = prices[x]+dp(prices,x+1,k-1,1,memo);
            notTake = 0+dp(prices,x+1,k,0,memo);
            profit = Math.max(take,notTake);
        }
        return memo[x][stat][k] = profit;
    }
    public int maxProfit(int k, int[] prices) {
        Integer[][][] memo = new Integer[prices.length][2][k+1];
        return dp(prices,0,k-1,1,memo);
    }
}