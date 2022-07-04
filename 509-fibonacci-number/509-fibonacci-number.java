class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1) return (n == 0) ? 0 : 1;
        int num1 = 0, num2 = 1, num3 = 0;
        for(int i =2;i < n+1; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }
}