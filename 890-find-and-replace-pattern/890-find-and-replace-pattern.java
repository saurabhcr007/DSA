class Solution {
    public boolean isMatch(String word, String pattern) {
        int n = word.length();
        if(n!=pattern.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        boolean[] used = new boolean[26];
        for(int i=0;i<n;i++){
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(word.charAt(i)))
                    return false;
            }
            else if(used[word.charAt(i)-'a'])
                return false;
            else{
                map.put(pattern.charAt(i), word.charAt(i));
                used[word.charAt(i)-'a'] = true;
            }
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for(String word: words) {
            if(isMatch(word, pattern))
                ans.add(word);
        }
        return ans;
    }
}