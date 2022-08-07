
class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        
        int n = keyName.length;
        
        Map<String, List<String>> map = new HashMap<>();
        List<String> res= new ArrayList<>();
            
        for(int i = 0; i< n; i++){
            if(!map.containsKey(keyName[i]))
                map.put(keyName[i], new ArrayList<>());
            
            map.get(keyName[i]).add(keyTime[i]);
        }
        
        
        for(Map.Entry<String, List<String>> m : map.entrySet()){
            List<String> st = m.getValue();
            
            Collections.sort(st, new Comparator<String> () {
                public int compare(String time1, String time2){
                    int t1 = time(time1);
                    int t2 = time(time2);
                    
                    return t1-t2;
                }
            });
            
            
            for(int i = 2 ; i < st.size(); i++){
                if(time(st.get(i))-time(st.get(i-2)) <= 60){
                     res.add(m.getKey());
                    break;
                }
                   
            }
            
            
            
        } 
        Collections.sort(res);
        return res;
        
        
    }
    
    
    public int time(String s){
        String[] temp = s.split(":");
        return Integer.parseInt(temp[0])*60+Integer.parseInt(temp[1]);
    }
}