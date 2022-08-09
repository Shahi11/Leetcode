class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> res = new ArrayList<>();
        
        rec(0, s, new ArrayList<>(), res);
        
        return res;
        
    }
    
    public void rec(int index, String s, List<String> cur, List<List<String>> res){
        
        if(index == s.length()){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for(int i = index; i < s.length(); i++){
            if(checkPall(s, index, i)){
                cur.add(s.substring(index, i+1));
                rec(i+1, s, cur, res);
                cur.remove(cur.size()-1);
            }
        }
    }
    
    public boolean checkPall(String s, int st, int e){
        
        while(st <= e){
            if(s.charAt(st++) != s.charAt(e--))
                return false;
        }
        
        return true;
            
    }
}