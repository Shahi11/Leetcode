class Solution {
    public int findShortestSubArray(int[] nums) {
        
        Map<Integer, int[]> map = new HashMap<>();
        int max =0, res= 0;
        for(int i = 0 ; i < nums.length; i++){
            int n = nums[i];
            if(!map.containsKey(n)){
                map.put(n, new int[]{i,i,1});
                if(max ==0) max =1;
                if(res == 0) res = 1;
            }
            else{
                int[] tp = map.get(n);
                tp[1] = i;
                tp[2]++;
                if(tp[2] > max) {
                    max = tp[2];
                    res = tp[1]-tp[0]+1;
                }
                else if(tp[2] == max){
                    res = Math.min(res,tp[1]-tp[0]+1);
                }
            }
        }
        
        return res;
    }
}