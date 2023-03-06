//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.noConseBits(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int noConseBits(int n) {
        // code here
        int ans=0,count=0,pos=0;
        while(n!=0){
            if((n&1)==1){
                count++;
                ans+=Math.pow(2,pos);
            }
            else{
                int temp= pos;
                while(count>=3){
                    ans-=Math.pow(2,temp-3);
                    count-=3;
                    temp-=3;
                }
                count=0;
            }
            n>>=1;
            pos++;
        }
        while(count>=3){
            ans-=Math.pow(2,pos-3);
            pos-=3;
            count-=3;
        }
        return ans;
    }
}
        
