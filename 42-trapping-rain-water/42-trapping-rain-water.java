class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int[] presum = new int[n];
        int[] sufsum = new int[n];
        
        int lmax = 0 , rmax = 0, sum =0;
        for(int i = 0 ; i< n ; i++){
            lmax = Math.max(lmax, height[i]);
            rmax = Math.max(rmax, height[n-i-1]);
            
            presum[i] = lmax;
            sufsum[n-i-1] = rmax;
        }
        
        for(int i = 0 ; i< n ; i++){
            sum += Math.min(presum[i],sufsum[i]) - height[i];
        }
        
        return sum;
        
        
    }
}