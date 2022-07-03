class Solution {
    private void isSafe(int[][] image, int i, int j, int color, int c){
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] == color || image[i][j] != c){
            return;
        }
        image[i][j] = color;
        isSafe(image, i + 1, j, color, c);
        isSafe(image, i, j+1, color, c);
        isSafe(image, i-1, j, color, c);
        isSafe(image, i, j-1, color, c);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int c = image[sr][sc];
        isSafe(image, sr, sc, color, c);
        return image;
    }
}