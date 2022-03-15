class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        if(n < 2) return 0;
        
        int sum = 0, min = nums[0];
        for(int i: nums){
            min = Math.min(min,i);
            sum = sum+i;
        }
        
        return sum - n*min;
    }
}