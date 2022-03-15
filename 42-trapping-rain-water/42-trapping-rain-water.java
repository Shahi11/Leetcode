class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        int[] l = new int[n];
        int[] r = new int[n];
        int max = 0, sum =0;
        for(int i = 0 ; i < n ; i++){
            max = Math.max(height[i],max);
            l[i] = max;
        }
        
        max =0;
        for(int j = n-1 ; j >=0; j--){
            max =Math.max(height[j],max);
            r[j] = max;
        }
        
        for(int i = 0 ; i < n ; i++){
            sum += (Math.min(l[i],r[i])- height[i]);
        }
 
      
        return sum;
        
        
    }
}