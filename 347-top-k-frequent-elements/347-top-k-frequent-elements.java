class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0 ; i < nums.length; i++){
            int freq = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],freq);
            max = Math.max(max,freq);
        }
        
        List<Integer>[] ls = new List[max+1];
        
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(ls[freq] == null)
                ls[freq] = new ArrayList<>();
            ls[freq].add(key);
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int j = ls.length-1; j>0 && k>0;j--){
            if(ls[j] != null){
                List<Integer> tmp = ls[j];
                ans.addAll(tmp);
                k=k-tmp.size();
            }
        }
        
        return ans.stream().mapToInt(i->i).toArray();
    }
}