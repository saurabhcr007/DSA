class Solution {
    public int countOdds(int low, int high) {
        int num=low;
        int count=0;
        if(num%2==0){
            num++;
        }
        while(num<=high){
            count=count+1;
            num=num+2;
        }
        return count;
    }
}