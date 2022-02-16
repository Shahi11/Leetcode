class Solution {
    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length-1;
        for(int i = 0 ; i < height.length;i++){
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