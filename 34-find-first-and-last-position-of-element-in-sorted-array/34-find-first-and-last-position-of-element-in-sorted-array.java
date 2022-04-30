class Solution {
    public static int binarysearch(int[] arr, int x){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int found=binarysearch(nums, target);
        if(found==-1){
            result[0]=-1;
            result[1]=-1;
        }
        else{
            result[0]=found;
            result[1]=found;
            while(found>0 && nums[found-1]==target){
                found--;
                result[0]=found;
            }
            while(found<nums.length-1 && nums[found+1]==target){
                found++;
                result[1]=found;
            }
        }
        return result;
    }
}