class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        int sum = 0 , max = nums[0];
        for(int i : nums){
            sum += i;
             max = Math.max(sum, max);
            if(sum < 0){
                sum = 0;
            }
           
        }
        
        return max;
    }
}