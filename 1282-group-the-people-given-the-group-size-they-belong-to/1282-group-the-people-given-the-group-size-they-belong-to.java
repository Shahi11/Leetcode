class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0 ; i< groupSizes.length; i++){
            if(!map.containsKey(groupSizes[i])){
                ArrayList<Integer> ls = new ArrayList<>();
                ls.add(i);
                map.put(groupSizes[i],ls);
            }
            else{
                map.get(groupSizes[i]).add(i);
            }
        }
        
        
        for(int i : map.keySet()){
            List<Integer> ls = map.get(i);
            if(ls.size() <= i)
                res.add(ls);
            else{
                for(int j = 0 ; j < ls.size(); j=j+i){
                    ArrayList<Integer> tmp = new ArrayList<>();
                    for(int k = j; k < j+i; k++){
                        tmp.add(ls.get(k));
                    }
                    res.add(tmp);
                }
            }
            
        }
        
        return res;
        
    }
}