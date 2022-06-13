class Solution {
    public int maxProduct(int[] nums) {
        
        int max = 1, min =  1;
        int res = Arrays.stream(nums).max().getAsInt();
        for(int i : nums){
            
            if(i == 0){
                max=1;
                min =1;
                continue;
            }
            int temp = Math.max(Math.max(i*max, i*min),i);
            min = Math.min(i*max, Math.min(i*min,i));
            max = temp;
            res = Math.max(max,res);
        }
        
        return res;
        
    }
}