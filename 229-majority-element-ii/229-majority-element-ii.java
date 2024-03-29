class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
            
            if(map.get(i) > n/3 && !res.contains(i))
                res.add(i);
        }
        
        return res;
        
    }
}