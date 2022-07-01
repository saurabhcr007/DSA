class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt((o) -> -o[1]));
        
        int result = 0;
        for(int i = 0; i < boxTypes.length; i++){
            int mn = Math.min(truckSize, boxTypes[i][0]);
            result += mn * boxTypes[i][1];
            truckSize -= mn;
            if(truckSize <= 0){
                return result;
            }
        }        
        return result;
    }
}