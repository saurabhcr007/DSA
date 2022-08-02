class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int start=matrix[0][0],end = matrix[n-1][n-1];
        int ans=start;
        while(start<end) {
            int mid = start+(end-start)/2;

            int count=0;
            for(int i=0;i<n;++i){
                count+= upperbound(matrix[i],mid);
            }
            if(count <k){
                start=mid+1;
                ans=start;
            }else{

                end=mid;
            }
        }
        return start;
    }
    
    public int upperbound(int[] arr, int target){
        int l=0,h=arr.length-1;
        int ans =h+1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>target){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}