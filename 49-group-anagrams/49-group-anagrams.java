class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();
        
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s : strs){
           char[] ch = s.toCharArray();
           Arrays.sort(ch);
           String ns = String.valueOf(ch);
           if(map.containsKey(ns)){
                map.get(ns).add(s);    
           }
            else{
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(ns,l); 
            }
        }
        
        map.forEach((k,v)->{
            res.add(v);
        });
        
        return res;
    }
}