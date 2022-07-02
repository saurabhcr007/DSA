class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
	
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int horizontal_length = horizontalCuts.length - 1, vertical_length = verticalCuts.length - 1;
        long maxX = horizontalCuts[0], maxY = verticalCuts[0];
        
        for (int i = 1; i <= horizontal_length; i++) {
            maxX = Math.max(maxX, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        maxX = Math.max(maxX, h - horizontalCuts[horizontal_length]);
        
        for (int i = 1; i <= vertical_length; i++) {
            maxY = Math.max(maxY, verticalCuts[i] - verticalCuts[i - 1]);
        }
        maxY = Math.max(maxY, w - verticalCuts[vertical_length]);
        
        return (int) (maxX * maxY % 1000000007);
    }
}