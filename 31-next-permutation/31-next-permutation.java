class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length-1;
        int i = n-1;
        
        while(i >= 0 && nums[i+1] <= nums[i]) i--;
        
        if(i >= 0){
            int j = n;
            while( j >= 0 && nums[j] <= nums[i])j--;
            swap(nums,i,j);
        }
        
        int start = i+1, end = n;
        while(start < end)
        {
            swap(nums, start++, end--);
        }
        
        
        
        
    }
    
    
    public void swap(int[] nums, int i, int j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
    }
}