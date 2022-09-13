class Solution {
    public int binarysearch(int[] nums,int start,int last,int target){
        if(start<=last){
            int mid=(start+(last-start)/2);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                return(binarysearch(nums,mid+1,last,target));
            }
            return(binarysearch(nums,start,mid-1,target));
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int start=0;
        int last=nums.length-1;
        return binarysearch(nums,start,last,target);
        // int n = nums.length;
        // int start = 0;
        // int end = n-1;
        // while(start<=end) {
        //     int mid =((start+end)/2);
        //     if(nums[mid] == target) return mid;
        //     if(nums[mid] < target) start = mid + 1;
        //     else end = mid - 1;
        // }
        // return -1;
    }
}