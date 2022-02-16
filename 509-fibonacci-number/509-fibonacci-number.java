class Solution {
    public int fib(int n) {
        
        int one = 0, two =1;
        int sum = 0;
        if(n <2) return n;
        for(int i =2; i<= n;i++){
            sum = one+two;
            one = two;
            two = sum;
        }
        
        return sum;
    }
}