class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] out = new int[101];
        int len = nums.length; 
        
        for(int i = 0 ; i < len ; i++){
            out[nums[i]]++;
        }
        
        for(int i = 1; i < 101; i++){
            out[i] += out[i-1];
        }
        
        for(int i = 0; i < len; i++){
            if(nums[i] > 0){
                nums[i] = out[nums[i]-1]; 
            } 
        }
        
        return nums;
    }
}