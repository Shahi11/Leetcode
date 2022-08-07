class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        HashMap<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();

        for(String s: cpdomains){
            
            String[] temp = s.split(" ");
            
            String[] domain = temp[1].split("[.]");
            
            StringBuilder st = new StringBuilder();

            st.append(domain[domain.length-1]);
                        map.put(domain[domain.length-1], map.getOrDefault(st.toString(),0)+Integer.parseInt(temp[0]));
            
            for(int i = domain.length-2; i >= 0; i--){
                st.insert(0,".");
                st.insert(0,domain[i]);
                map.put(st.toString(), map.getOrDefault(st.toString(),0)+Integer.parseInt(temp[0]));
            }
            
        }
            
            
            for(Map.Entry<String, Integer> et : map.entrySet()){
                res.add(String.valueOf(et.getValue()) + " "+ et.getKey());
            }
            
            return res;

    }
}