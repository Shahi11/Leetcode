class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] dp = new int[text2.length()+1][text1.length()+1];
        int l1 = text1.length();
        int l2 = text2.length();
        
        for(int i = 0; i <= l2; i++){
            for(int j = 0 ; j<= l1; j++){
                if(i == 0 || j == 0)
                    dp[i][j] =0;
                else if(text2.charAt(i-1) == text1.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        return dp[l2][l1];
    }
}