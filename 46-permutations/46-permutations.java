class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        permutation(nums,res,perm,check);
        
        return res;
    }
    
    public void permutation(int[] nums, List<List<Integer>> res, List<Integer> perm, boolean[] check){
        
        
        if(nums.length == perm.size()){
            res.add(new ArrayList<>(perm));
            return;
        }
        
        for(int i = 0 ; i < nums.length; i++){
            if(!check[i]){
                check[i] = true;
                perm.add(nums[i]);
                permutation(nums,res,perm,check);
                perm.remove(perm.size()-1);
                check[i] = false;
                
            }
            
            
        }
        
    }
}