class Solution {
    public int numMatchingSubseq(String t, String[] words) {
        int count=0;
        Map<String,Boolean> m = new HashMap<>();
        for(String s : words){
            if(m.containsKey(s)){
                if(m.get(s)) count++;
            }else{
                int i=0;
                int j=0;
                while(i<s.length() && j<t.length()){
                    if(s.charAt(i)==t.charAt(j)){
                        i++;
                    }
                    j++;
                }
                if(i==s.length()){
                    count++;
                    m.put(s,true);
                }else{
                    m.put(s,false);
                }
            }
        }
        
        return count;
    }
}