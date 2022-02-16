class Solution {
    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length-1;
        while( left<right){
            int tmp = Math.min(height[left], height[right])*(right-left);
            if(tmp > max){
                max = tmp;  
            }
             if(height[left]> height[right]) 
                 right--;
                else
                    left++;  
        }
        
        return max;
    }
}