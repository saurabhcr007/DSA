class Solution {
        public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
            
            boolean[] offLamps = new boolean[lamps.length];
            int[] result = new int[queries.length];
            
            for(int i=0; i<queries.length; i++){
                int[] q = queries[i];
                
                if(isIlluminated(q[0], q[1], lamps, offLamps)){
                    result[i] = 1;
                    turnOffLamp(q[0], q[1], lamps, offLamps);
                }else{
                    result[i] = 0;
                }
                
            }
            
            return result;
            
        }
        
        private boolean isIlluminated(int y, int x, int[][] lamps, boolean[] offLamps ){
            
            for(int i=0; i<lamps.length; i++){
                if(offLamps[i]) continue;
                if(x == lamps[i][1]
                  || y == lamps[i][0]
                  || x+y == lamps[i][0] + lamps[i][1]
                  || x-y == lamps[i][1] - lamps[i][0]){
                    return true;
                }
            }
            
            return false;
            
        }
        
        private void turnOffLamp(int y, int x, int[][] lamps, boolean[] offLamps){
            for(int i=0; i<lamps.length; i++){
                if(offLamps[i]) continue;
                
                if((lamps[i][0] >= y-1 && lamps[i][0] <= y+1) && (lamps[i][1] >= x-1 && lamps[i][1] <= x+1)){
                    offLamps[i] = true;
                    continue;
                }
               
            }
        }
    }