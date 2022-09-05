class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        int z=operations.length;
        for(int i=0;i<z;i++){
            if(operations[i].contains("--")){
                x=x-1;
            }
            else{
                x=x+1;
            }
        }
        return x;
    }
}