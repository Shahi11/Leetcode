class Solution {
    public int climbStairs(int n) {
        int[] res = new int[n+1];
        res[0]=1;
        res[1]=1;
        for(int i = 2; i <= n ; i++){
            res[i] = res[i-1] + res[i-2];
        }
        
        return res[n];
        
    }
}

// 1 = 1
// 2 = 1,2 = 2
// 3 = 111,12,21 = 3
// 4 = 1111,22,121,211,112 =   5  
// 5 =  11111,221,212,122,1112,1121,1211,2111 = 8   
