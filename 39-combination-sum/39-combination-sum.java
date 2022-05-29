class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        rec(candidates, target, res, new ArrayList<>(),0);
        return res;
    }
    
    
    public void rec(int[] can, int t, List<List<Integer>> res, List<Integer> cur, int i){
        
        if(i == can.length){
            if(t == 0){
                res.add(new ArrayList<>(cur));
                return;
            }
            return;
        }
        
        if(can[i] <= t){
            cur.add(can[i]);
            rec(can,t-can[i],res,cur,i);
            cur.remove(cur.size()-1);
        }
        rec(can,t,res,cur,i+1);
    } 
}