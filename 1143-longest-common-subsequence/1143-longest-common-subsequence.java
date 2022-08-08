class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
      int l1 = text1.length();
        int l2 = text2.length();
        int[][] dp = new int[l1+1][l2+1];
        
        for(int i = 0 ; i <= l1; i++){
            for(int j = 0; j<= l2; j++){
                if(i ==0 || j ==0)
                    dp[i][j] = 0;
                
                else if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        
        return dp[l1][l2];
        
    }
}


//Recursion: check each index of both string and move ahead; 2^max(m,n)

//Time complexity: m*n
//space complexity: m*n
