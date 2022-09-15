class Solution {
    //int max=0,area=0;
    public int maxArea(int[] height) {
        
        //BRUTE FORCE
        
        // int i=0;
        // int max=0,area=0;
        // for(;i<height.length-1;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         if(height[i]>=height[j]){
        //             area=(j-i)*height[j];
        //         }
        //         else{
        //             area=(j-i)*height[i];
        //         }
        //         System.out.println("i-"+i+" "+"j-"+j+" "+"area-"+area);
        //         if(area>max){
        //             max=area;
        //         }
        //     }
        // }
        // return max;
        
        //OPTIMAL SOLUTION
        
        int start=0;
        int last=height.length-1;
        int max=0;
        int area=0;
        while(start<last){
            area=(last-start)*Math.min(height[start],height[last]);
            max=Math.max(max,area);
            if(height[start]>height[last]){
                last--;
            }
            else if(height[start]==height[last]){
                if(height[start+1]>height[last-1]){
                    start++;
                }
                else{
                    last--;
                }
            }
            else{
                start++;
            }
            //helper(height,start,last,)
        }
        return max;
    }
}