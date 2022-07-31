class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        res.add(prev);
        
        for(int i = 1 ; i< numRows; i++){
            
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < prev.size(); j++)
                temp.add(prev.get(j)+prev.get(j-1));
            temp.add(1);
            
            prev = temp;
            res.add(temp);
        }
        
        
        return res;
        
    }
}