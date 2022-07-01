class Solution {
    public int maxProfit(int[] prices) {
        int minelement=Integer.MAX_VALUE;
       int profit=0,maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(minelement>=prices[i])
             minelement=prices[i];
            else{
                 profit=prices[i]-minelement;
                if(profit>maxprofit)
                    maxprofit=profit;
                }
            
        }
       return maxprofit; 
    }
}