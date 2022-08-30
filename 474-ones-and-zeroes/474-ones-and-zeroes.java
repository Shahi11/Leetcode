class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
     dp = new int[m+1][n+1][strs.length];
    // for(int[][] r: dp){
    //     for(int[] row: r) 
    //         Arrays.fill(row, -1);
    //     }
        return solve(strs, m, n, 0);
    }
    
    
    public int solve(String[] strs, int m, int n, int i){
        
        if(i == strs.length)
            return 0;
        
        if(dp[m][n][i] != 0)
            return dp[m][n][i];
        
        int c1 = 0, c0 = 0;
        for(int k = 0; k < strs[i].length(); k++){
            if(strs[i].charAt(k) == '1')
                c1++;
        }
        c0 = strs[i].length() - c1;
        
        if(c0 <= m && c1 <= n){
            return dp[m][n][i] = Math.max(solve(strs,m-c0, n -c1, i+1)+1, solve(strs, m, n, i+1));
        }
        else{
          return  dp[m][n][i] = solve(strs,m,n,i+1);
        }
        
    }
}