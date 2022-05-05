class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
    
    for(int i : nums){
        
        product = signFunc(signFunc(i) * product);
    }
    
    return product;
    
}

public int signFunc(int x){
            
    if(x < 0){
        x = -1;
    }else if(x == 0){
        x = 0;
    }else{
        x = 1;
    }
    
    return x;
        }
}