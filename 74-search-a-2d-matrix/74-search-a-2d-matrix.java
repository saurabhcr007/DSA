class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int k=m/2,f=n/2;
        int mid=matrix[k][f];
        if(target==mid){
            return true;
        }
        else if(target<mid){
            for(int i=0;i<=k;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==target){
                        return true;
                    }
                    else if(matrix[i][j]>target){
                        return false;
                    }
                }
            }
        }
        else if(target>mid){
            for(int i=k;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==target){
                        return true;
                    }
                    else if(matrix[i][j]>target){
                        return false;
                    }
                }
            }
        }
        return false;
    }
}