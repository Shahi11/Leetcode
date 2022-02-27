class Solution {
    public int maxSubArray(int[] nums) {
      return maxsubarray(nums, 0, nums.length-1);
    }
    
    public int middlemax(int[] nums, int l, int r){
        int m = l+(r-l)/2;
        int lmax = Integer.MIN_VALUE;
        int lsum = 0;
        for (int i = m ; i >= l ;i--){
            lsum += nums[i];
            lmax = Math.max(lsum, lmax);
        }
        int rmax = Integer.MIN_VALUE;
        int rsum = 0;
           for (int i = m+1 ; i<= r;i++){
            rsum += nums[i];
            rmax = Math.max(rsum, rmax);
        }
        return rmax+lmax;   
    }
    
    
    public int maxsubarray(int[] nums, int l, int r){
       
        if (l ==r) {
            return nums[l];
        }
         int m = l+(r-l)/2;
         int lmax = maxsubarray(nums, l, m);
         int rmax = maxsubarray(nums, m+1, r);
         int cmax = middlemax(nums, l, r);
        
        return Math.max(lmax, Math.max(rmax, cmax));
    }
}