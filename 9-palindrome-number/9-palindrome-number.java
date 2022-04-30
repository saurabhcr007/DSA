class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y=x;
        int z=0;
        while(y>0){
            z=z*10+y%10;
            y=y/10;
        }
        if(z==x) return true;
        else return false;
    }
}