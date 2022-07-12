class Solution {
     public int uniquePaths(int m, int n) {
        int temp[][]=new int[m+1][n+1];
        temp[m-1][n]=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                temp[i][j]=temp[i][j+1]+temp[i+1][j];
            }
        }
        return temp[0][0];
    }
}