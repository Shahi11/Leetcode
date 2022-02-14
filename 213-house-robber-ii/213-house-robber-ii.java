class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        
        return Math.max(robber(nums, 0, nums.length-2), robber(nums, 1, nums.length-1));
    }
    
    public int robber(int[] nums, int start, int end){
        int[] dp = new int[nums.length-1];
        
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);
        int j = 2;
        for(int i = start+2 ; i <= end; i++){
            dp[j] = Math.max(dp[j-2]+nums[i], dp[j-1]);
            j++;
        }
        
        return dp[nums.length-2];
    }
}