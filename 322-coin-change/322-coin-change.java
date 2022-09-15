   
//NORMAL SOLUTION

// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int len=coins.length;
//         Arrays.sort(coins);
//         int sum=coins[len-1];
//         int count=1;
//         if(amount==0){
//             return 0;
//         }
//         if(len==1){
//             if(amount%coins[0]==0){
//                 return amount/coins[0];
//             }
//             else{
//                 return -1;
//             }
//         }
//         for(int i=len-1;i>=0;){
//             if(sum<amount){
//                 sum+=coins[i];
//                 count++;
//             }
//             if(sum>amount){
//                 sum-=coins[i];
//                 i--;
//                 count--;
//             }
//             if(sum==amount){
//                 break;
//             }
//             if(i==-1){
//                 return -1;
//             }
//         }
//         return count;
//     }
// }

    //OPTIMAL SOLUTION

class Solution {
    public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    for (int i=1; i < dp.length; i++) {
      dp[i] = dp.length;
      for (int j=0; j < coins.length; j++) {
        if (i >= coins[j]) dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
      }
    }
    return dp[amount] == dp.length ? -1 : dp[amount];
  }
}