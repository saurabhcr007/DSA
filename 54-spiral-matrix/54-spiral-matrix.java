class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new LinkedList<>(); 
        if (matrix==null || matrix.length==0) {
            return list;
            }
        int n=matrix.length, m=matrix[0].length;
        int up=0,down=n-1;
        int left=0,right=m-1;

        while(up<=down){
            for (int i = left; i <= right && list.size()<n*m; i++){
                list.add(matrix[up][i]);
            }
            
            for (int i = up+1; i <= down-1 && list.size()<n*m; i++){
                list.add(matrix[i][right]);
            }
                     
            for (int i = right; i >= left && list.size()<n*m; i--){
                list.add(matrix[down][i]);
            }
                        
            for (int i = down-1; i >= up+1 && list.size()<n*m; i--){
                list.add(matrix[i][left]);
            }
            up++;
            left++;
            down--;
            right--;
        }
        return list;
    }
}