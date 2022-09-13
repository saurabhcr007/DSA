class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int len=s.length();
        HashSet<Character> checker=new HashSet();
        for(int i=0,j=0;j<len;j++){
            if(!checker.contains(s.charAt(j))){
                checker.add(s.charAt(j));
                count=Math.max(count,checker.size());
            }
            else{
                checker.remove(s.charAt(i));
                i++;
                j--;
            }
        }
        return count;
    }
}