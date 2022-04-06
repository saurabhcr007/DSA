class Solution {
    public int binarysearch(int[]a, int first,int last,int target){
        if(last>=first)
        {
            int mid=first+(last-first)/2;
            if(a[mid]==target)
                return mid;

            if(a[mid]>target)
                return(binarysearch(a,first,mid-1,target));
            
            return(binarysearch(a,mid+1,last,target));
        }
        return -1;
    }
    public int search(int[] nums, int target)
    {
        int first=0;
        int last=nums.length-1;
        int res=binarysearch(nums,first,last,target);
        return res;
    }
}