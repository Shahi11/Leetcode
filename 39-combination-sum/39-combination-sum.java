class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        
        helper(0,candidates, target, res, new ArrayList<>());
        
        return res;
    }
    
    public void helper(int index, int[] num, int t, List<List<Integer>> res, List<Integer> cur){
        
        if(index == num.length){
            if(t == 0)
                res.add(new ArrayList<>(cur));
            
            return;
        }
        if(num[index] <= t){
            cur.add(num[index]);
            helper(index,num, t- num[index], res, cur);
            cur.remove(cur.size()-1);
        }
        helper(index+1,num,t,res,cur);
        
    }
}