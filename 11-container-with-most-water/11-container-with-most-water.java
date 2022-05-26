class Solution {
    public int maxArea(int[] height) {
         int len = height.length;
        int left = 0, right = len-1,max =0;
       
        for(int i = 0 ; i < len; i++){
            
          int temp = Math.min(height[left],height[right])*(right-left);
          max = Math.max(max,temp);
          
            if(height[left]>height[right]){
                right--;
            }
            else
                left++;
        }
        
        return max;
    }
}