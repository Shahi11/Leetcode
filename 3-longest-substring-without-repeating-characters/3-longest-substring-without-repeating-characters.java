class Solution {
    public int lengthOfLongestSubstring(String s) {
       
       HashMap<Character, Integer> map = new HashMap<>();
        
        int start = -1 , nstart = 0, max = 0; 
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                nstart = map.get(c);
                start = Math.max(nstart, start);
            }
            
            map.put(c,i);
            max = Math.max(max, i-start);
            
        }
        return max;
    }
}