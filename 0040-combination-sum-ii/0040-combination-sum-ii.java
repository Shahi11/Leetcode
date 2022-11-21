class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        
        helper(0, target, candidates, res, new ArrayList<>());
        
        return res;
        
        
    }
    
    public void helper(int index, int target, int[] candidates, List<List<Integer>> res, List<Integer> cur){
       
        
            if(target == 0){
                res.add(new ArrayList<>(cur));
            
            return;
            }
        
        
        for(int i = index ; i < candidates.length; i++){
            if(index != i && candidates[i] == candidates[i-1])
                continue;
            if(candidates[i] > target)
                break;
            cur.add(candidates[i]);
            helper(i+1, target - candidates[i], candidates, res, cur);
            cur.remove(cur.size()-1);
        }
        
    }
}