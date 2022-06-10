class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i : nums){
                map.put(i, map.getOrDefault(i,0)+1);
             max = Math.max(max, map.get(i));
        }
        
        ArrayList<Integer>[] ls = new ArrayList[max+1];
        
        for(int i : map.keySet()){
            int freq = map.get(i);
            if(ls[freq] == null)
                ls[freq] = new ArrayList<>();
            ls[freq].add(i);
        }
        
        List<Integer> res = new ArrayList<>();
        for(int i = ls.length-1; i >= 0 && k >0; i--){
            if(ls[i] != null){
                //List<Integer> tmp = ls[i];
                res.addAll(ls[i]);
                k = k - ls[i].size();
            }
        }
        
        return res.stream().mapToInt(i->i).toArray();
    }
}