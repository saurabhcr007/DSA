class Solution {
    public int minDeletions(String s) {
        if(s.length()==0 || s.length()==1){
            return 0;
        }
        
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        HashSet<Integer> hs = new HashSet<>();
        int delCount=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==0)break;
            
            while(freq[i]!=0 && hs.contains(freq[i])){
                freq[i]--;
                delCount++;
            }
            
            hs.add(freq[i]);
        }
        return delCount;
    }
}