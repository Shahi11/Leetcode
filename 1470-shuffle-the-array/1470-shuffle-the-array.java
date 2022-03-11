class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] res = new int[2*n]; int c1=0, c2=n,c3=0;
        for(int i = 0 ; i< n; i++){
            res[c3++] = nums[c1++];
            res[c3++] = nums[c2++];
        }
            
        return res;
    }
}