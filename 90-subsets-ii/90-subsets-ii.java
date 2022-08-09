class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        subset(0,nums,res, new ArrayList<>());
        
        return res;
    }
    
    public void subset(int index, int[] nums, List<List<Integer>> res, List<Integer> cur){
        res.add(new ArrayList<>(cur));
        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i-1])
                continue;
            cur.add(nums[i]);
            subset(i+1, nums, res, cur);
            cur.remove(cur.size()-1);
        }
    }
}



//TC: O(2^n)