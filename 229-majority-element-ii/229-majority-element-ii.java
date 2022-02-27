class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i< nums.length; i++){
            int freq = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],freq);
            if(!res.contains(nums[i]) && freq > nums.length/3){
                res.add(nums[i]);
            }
         
        }
        
        return res;
    }
}