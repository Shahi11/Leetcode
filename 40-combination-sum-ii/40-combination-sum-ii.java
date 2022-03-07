class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,res, new ArrayList<>());
    
        return res;
    }
    
    public void helper(int i, int[] num, int t, List<List<Integer>> res, List<Integer> cur){
        
   
            if(t == 0){
                res.add(new ArrayList<>(cur));
            
            return;
        }
        
        
        for(int j = i; j< num.length; j++){
        if(j > i && num[j] == num[j-1]) continue;
        if(num[j] > t) break;
            cur.add(num[j]);
            helper(j+1,num,t-num[j],res,cur);
            cur.remove(cur.size()-1);
        
        
        }
        
    }
}