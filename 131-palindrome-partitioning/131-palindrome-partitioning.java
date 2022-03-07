class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> res = new ArrayList<>();
        
        helper(0, s,res, new ArrayList<>());
        return res;
    }
    
    public void helper(int index, String s, List<List<String>> res, List<String> cur){
        if(s.length() == index){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for(int i = index; i< s.length(); i++){
            if(isPallindrome(s,index,i)){
                cur.add(s.substring(index,i+1));
                helper(i+1,s,res,cur);
                cur.remove(cur.size()-1);
            }
        }
        
    }
    
    public boolean isPallindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        
        return true;
    }
}