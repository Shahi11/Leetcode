class Solution {
    public boolean canJump(int[] nums) {
        int ind = nums.length-1;
        
        for(int i = ind; i >= 0 ; i--){
            
            if(i + nums[i] >= ind)
                ind = i;
        }
        
        return ind == 0;
    }
}