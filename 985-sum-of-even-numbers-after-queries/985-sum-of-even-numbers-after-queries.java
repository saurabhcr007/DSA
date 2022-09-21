class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        int len=nums.length;
        int[] temp=new int[len];
        int key=0;
        int pos=0;
        int j=0;
        while(j<len){
            if(nums[j]%2==0)
                sum = sum+nums[j];
            j++;
        }
        for(int i=0;i<queries.length;i++){
            key=queries[i][0];
            pos=queries[i][1];
            if(nums[pos]%2==0){
                sum-=nums[pos];
            }
            nums[pos]=nums[pos]+key;
            if(nums[pos]%2==0){
                sum+=nums[pos];
            }
            temp[i]=sum;
        }
        return temp;
    }
}