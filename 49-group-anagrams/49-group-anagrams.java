class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         ArrayList<List<String>> arr = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0 ; i< strs.length; i++){
            String st = strs[i];
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String sorted =String.valueOf(ch);
            if(map.containsKey(sorted)){
                List<String> sol = map.get(sorted);
                sol.add(st);
                map.put(sorted,sol);
            }
            else{
                List<String> sol = new ArrayList<>();
                sol.add(st);
                map.put(sorted,sol);
            }
        }
        
        map.forEach((k,v)->{
           arr.add(v); 
        });
        return arr;
    }
}