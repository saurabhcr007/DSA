class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int pro=1;
        // int len=nums.length;
        // for(int i=0;i<len;i++){
        //     pro*=nums[i];
        // }
        // int[] arr=new int[len];
        // for(int i=0;i<len;i++){
        //     int temp=pro;
        //     temp=temp/nums[i];
        //     arr[i]=temp;
        // }
        // System.out.println(pro);
        // return arr;
        int len = nums.length;
        int[] arr=new int[len];
        int r=1,c=1;
        for(int i=len-1;i>=0;i--){
        arr[i]=r;
        r=r*nums[i];
        }
        for(int j=0;j<len;j++){
            arr[j]*=c;
            c*= nums[j]; 
        }
        return arr;
    }
}