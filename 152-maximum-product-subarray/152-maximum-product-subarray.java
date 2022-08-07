class Solution {
    public int maxProduct(int[] nums) {
        
        
        int max = 1, min = 1;
        int res = Arrays.stream(nums).max().getAsInt();
        for(int i : nums){
            if(i==0){
                max = min = 1;
                continue;
            }
            
            int temp = i* max;
            max = Math.max(i*max, Math.max(i*min,i));
            min = Math.min(temp, Math.min(i*min,i));
            
            res = Math.max(res, max);
            
    
            
        }

        return res;
                
        
    }
}