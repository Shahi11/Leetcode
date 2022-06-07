class Solution {
    public String minWindow(String s, String t) {
        
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        
        int i = 0, j = 0, start = 0,  end = s.length()-1, count = map.size(), len = s.length();
        boolean found = false;
        
        while(j < s.length()){
            char c = s.charAt(j++);
            
            if(map.containsKey(c)){
                map.put(c , map.getOrDefault(c,0)-1);
                if(map.get(c) == 0)
                    count--;
            }
            
            if(count > 0)
                continue;
            
            while(count == 0){
                char ch = s.charAt(i++);
                if(map.containsKey(ch)){
                    map.put(ch, map.getOrDefault(ch,0)+1);
                    if(map.get(ch)>0)
                        count++;
                }
            }
            
            if(j-i < len){
                start = i;
                end = j; 
                len = j-i;
                found = true;
            }
        }
        
        return found ? s.substring(start-1,end) : "";
    }
}