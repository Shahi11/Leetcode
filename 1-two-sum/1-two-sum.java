class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target-nums[i])){
                int[] res = new int[2];
                res[0]= i;
                res[1]= hm.get(target-nums[i]);
                return res;
            }
            hm.put(nums[i],i);
                
        }
        
        return null;
    }
}