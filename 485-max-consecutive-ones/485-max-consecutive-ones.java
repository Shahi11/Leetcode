class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0, local =0 ; 
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                local++;
                max = Math.max(max,local);
            }
             else{
            local = 0;
        }
        
        }
       
        return max;
    }
}