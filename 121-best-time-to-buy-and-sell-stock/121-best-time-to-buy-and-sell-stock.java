class Solution {
    public int maxProfit(int[] prices) {
        // int selling =Integer.MAX_VALUE;
        // int profit=0;
        // int maxprofit=0;
        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]<=selling){
        //         selling=prices[i];
        //     }
        //     else{
        //         profit=prices[i]-selling;
        //         if(profit>maxprofit){
        //             maxprofit=profit;
        //         }
        //     }
        // }
        // return maxprofit;
        int profit=0;
        int maxprofit=Integer.MIN_VALUE;
        int buying=prices[0];
        for(int i=0;i<prices.length;i++){
            buying=Math.min(buying,prices[i]);
            profit=prices[i]-buying;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}