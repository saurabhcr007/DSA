class Solution {
    public int maxProfit(int[] prices) {
        int[] temp = new int[prices.length];
        int maxProfit=0;
        for(int i = 1; i< prices.length; i++){
            temp[i-1] = prices[i] - prices[i-1];
        }
        for(int i = 0; i< temp.length;i++){
            if(temp[i] >0)
                maxProfit += temp[i];
        }
        return maxProfit;
    }
}