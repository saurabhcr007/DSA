class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int r=0,c=0;
        int len=original.length;
        int[][] arr=new int[m][n];
        int[][] temp=new int[0][0];
        if(n*m!=len){
            return temp;
        }
        for(int k=0;k<len;k++){
            arr[r][c]=original[k];
            c++;
            if(c==n){
                r++;
                c=0;
            }
        }
        return arr;
    }
}