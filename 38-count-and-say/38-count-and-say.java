class Solution {
    public String countAndSay(int n) {
        
        StringBuilder s = new StringBuilder("1");
        StringBuilder tmp = new StringBuilder("");
        for(int i = 2; i <= n; i++){
            
            for(int j = 0; j < s.length(); j++){
                int cnt = 1;
                while(j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)){
                    j++;
                    cnt++;
                }
                tmp.append(String.valueOf(cnt));
                tmp.append(s.charAt(j));
            }
            s = new StringBuilder(tmp);
            tmp = new StringBuilder("");
            
        }
        return s.toString();
    }
}