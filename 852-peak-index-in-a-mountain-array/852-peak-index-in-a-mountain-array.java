class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            int max=0,temp=0;
            if(arr[i]>arr[i+1])
            {
                return i;
            }
        }
        return arr.length-1;
    }
}