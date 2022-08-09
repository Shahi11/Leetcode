class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        helper(0, target, candidates, res, new ArrayList<>());
        
        return res;
        
        
    }
    
    public void helper(int index, int target, int[] candidates, List<List<Integer>> res, List<Integer> cur){
        
        if(index == candidates.length){
            if(target == 0){
                res.add(new ArrayList<>(cur));
               
            }
             return;
                
        }
        if(candidates[index] <= target){
            cur.add(candidates[index]);
            helper(index, target - candidates[index],candidates, res, cur);
            cur.remove(cur.size()-1);
        }
        
        helper(index+1, target,candidates, res, cur);
        
    }
}