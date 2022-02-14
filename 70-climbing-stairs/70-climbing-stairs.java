class Solution {
         
     
    public int climbStairs(int n) {
    int first = 1, second =1, sum = 0;
        
    if(n <=2) return n;
        
        for(int i = 2; i <= n ; i++){
            sum = first +second;
            first = second;
            second = sum;
            
        }
        
        return sum;
            
    }
     
}