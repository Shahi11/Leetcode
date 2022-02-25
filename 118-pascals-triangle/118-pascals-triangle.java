class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        res.add(tmp);
        
        for(int i = 1 ; i<numRows ; i++){
            List<Integer> prev = res.get(i-1);
              List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j =1 ; j< prev.size(); j++){
                temp.add(prev.get(j)+prev.get(j-1));
            }
            temp.add(1);
            res.add(temp);
        }
        
        return res;
    }
}