class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        int max = 0;
        for(String word : wordDict){
            max = Math.max(max,word.length());
        }
        dp[0] = true;
        for(int i = 0 ; i<=len; i++){
            for(int j = 0 ; j < i; j++){
                if(i-j > max) continue;
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[len];
    }
}