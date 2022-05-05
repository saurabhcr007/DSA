class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] sum=new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int flag=0;
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    flag=1;
                }
                else if(flag==1 && nums1[i]<nums2[j]){
                    sum[i]=nums2[j];
                    break;
                }
                else{
                    sum[i]=-1;
                }
            }
        }
        return sum;
    }
}