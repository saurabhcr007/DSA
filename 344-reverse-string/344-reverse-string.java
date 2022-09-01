class Solution {
    public void reverseString(char[] s) {
        
        int nums=s.length;
        char temp=0;
        int j=nums-1;
        for(int i=0;i<=j;i++){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
    }
}