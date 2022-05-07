class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = n;
        while (sum != 1) {
            sum = squareSum(sum);
            if (map.containsKey(sum)) {
                return false;
            }
            else{
                map.put(sum, 1);
            }
        }
        return true;
    }    
    public int squareSum(int n) {
        int sum=0;
        int n1=0;
        while (n!=0) {
            n1 = n%10;
            sum = sum + n1*n1;
            n = n/10;
        }
        return sum;
    }
}