class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        int l = 0, r = n-1, lmax = 0, rmax = 0, sum = 0;
        
        while(l <=r){
            if(height[l] <= height[r]){
                if(height[l] > lmax) lmax = height[l];
                sum += lmax -height[l];
                l++;
            }
            
            else{
                if(height[r] > rmax) rmax = height[r];
                sum += rmax - height[r];
                r--;
                
            }
        }
        return sum;
        
    }
}