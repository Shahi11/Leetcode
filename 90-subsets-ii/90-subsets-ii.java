class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        helper(0,res,new ArrayList<>(), nums);
        return res;
    }
    
    public void helper(int index, List<List<Integer>> res, List<Integer> cur, int[] nums){
        res.add(new ArrayList<>(cur));
        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i-1]) continue;
            cur.add(nums[i]);
            helper(i+1,res,cur,nums);
            cur.remove(cur.size()-1);
            
        }
        
    }
}