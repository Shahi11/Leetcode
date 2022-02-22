class Solution {
    public int maxProduct(int[] nums) {
        int max = 1, min = 1;
        int res = Arrays.stream(nums).max().getAsInt();
        for(int i = 0 ; i< nums.length; i++){
            int n = nums[i];
            if(n == 0){
                max = min =1;
                continue;
            }
        int tmp = max*n;
        max = Math.max(n*max, Math.max(n*min,n));
        min = Math.min(tmp, Math.min(n*min,n));
         res = Math.max(max,res);
        }
        
        return res;
        
    }
}