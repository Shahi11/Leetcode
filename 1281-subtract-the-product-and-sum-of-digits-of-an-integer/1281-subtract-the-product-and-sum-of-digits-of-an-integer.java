class Solution {
    public int subtractProductAndSum(int n) {
        
        if (n ==1) return 0;
        int prod = 1, sum = 0;
        while(n!= 0){
            int tmp = n % 10;
            prod *= tmp;
            sum += tmp;
            n = n/10;
        }
        
        return prod - sum;
    }
}