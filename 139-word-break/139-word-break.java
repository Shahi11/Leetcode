class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        int len = s.length();
        
        int max = 0;
        for(String ss : wordDict)
          max = Math.max(ss.length(), max);
        
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        for(int i = 0; i <= len; i++){
            for(int j = 0; j < i; j++){
                if(i-j > max) continue;
                if(dp[j] && wordDict.contains(s.substring(j,i)))
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[len];
    }
}