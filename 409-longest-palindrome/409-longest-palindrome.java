class Solution {
    public int longestPalindrome(String s) {
        int[] small = new int[26]; // store lower case alphabets
        int[] caps = new int [26]; // store upper case alphabets
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
                caps[s.charAt(i)-'A']=caps[s.charAt(i)-'A']==0?1:0; // remove elements that occur in pair
            } 
            if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                small[s.charAt(i)-'a']=small[s.charAt(i)-'a']==0?1:0;  // remove elements that occur in pair
            }
        }
        int odds= Arrays.stream(caps).sum()+Arrays.stream(small).sum();
        odds=odds>0?odds-1:odds;
        return s.length()-odds;
    }
}