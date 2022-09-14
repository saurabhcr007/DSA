class Solution {
    int maxlength,startingpoint;
    public String longestPalindrome(String s) {
        int i=0,j=0;
        int len=s.length();
        if(len==0 || len==1){
            return s;
        }
        String str=new String();
        for(;i<len-1;i++,j++){
            helper(s,i,j,len);
            helper(s,i,j+1,len);
        }
        str=s.substring(startingpoint,maxlength+startingpoint);
        return str;
    }
     public void helper(String s,int start, int last, int len){
        while(start>=0 && last<len && s.charAt(start)==s.charAt(last)){
            start--;
            last++;
        }
         if (maxlength < last-start-1) {
             startingpoint=start+1;
		    maxlength = last-start-1;
	    }
    }
}