class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        helper(0,res, new ArrayList<Integer>(),nums);
        return res;
        
        
    }
    
public void helper(int index, List<List<Integer>> res, List<Integer> cur, int[] nums)      {
    
    res.add(new ArrayList<>(cur));
    
    for(int i = index; i < nums.length; i++){
        cur.add(nums[i]);
        helper(i+1,res,cur,nums);
        cur.remove(cur.size()-1);
        
    }
        
    }
}