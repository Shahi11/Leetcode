class Solution {
    public String minWindow(String s, String t) {
        
        if(s == null || t == null || s.isEmpty() || t.isEmpty()) return "";
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i< t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
        }
        
        int i =0, j = 0 , start= 0 , end = s.length()-1, length = s.length(), count = map.size();
        boolean found = false;
        
        while(j<s.length()){
            
            char ch = s.charAt(j++);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) == 0) count = count -1;              
            }
            
            if(count > 0) continue;
            
            while(count == 0) {
                ch = s.charAt(i++);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch) > 0) count = count +1;
                }
            }
            
            if((j-i) < length){
                start = i;
                end = j;
                length = j-i;
                found =true;
            }
            
        }
        
        return found ? s.substring(start-1,end) : ""; 
        
    }
}