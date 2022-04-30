class Solution {
    public static int romanToInt(String s) {
        int sum = 0;
        int prev = 0;
        for(int i=0;i<s.length();i++){
            int curr = getValue(s.charAt(i));
             if(i!=0){
                 if(curr>prev){
                     sum -= (2*prev);
                 }
             }
             sum += curr; 
             prev = curr;
         }
         return sum;    
     }
    public static int getValue(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}