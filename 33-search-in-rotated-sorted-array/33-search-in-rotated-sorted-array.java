class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = (end+start)/2;
            if(nums[mid] == target)
                return mid;
            
            if(nums[mid]>=nums[start]){
                if(target >= nums[start] && nums[mid] > target)
                    end = mid-1;
                else
                    start = mid+1;
            }
            
            if(nums[end]>=nums[mid]){
                if(target > nums[mid] && nums[end] >= target)
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }   
}