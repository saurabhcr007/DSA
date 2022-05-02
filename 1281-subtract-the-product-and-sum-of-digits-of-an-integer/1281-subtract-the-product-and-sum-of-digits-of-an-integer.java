class Solution {
    public int subtractProductAndSum(int n) {
        int pod=1,sod=0,res=0;
        while(n>0){
            int temp=n%10;
            pod=pod*(temp);
            sod=sod+(temp);
            n=n/10;
        }
        res=pod-sod;
        return res;
    }
}
