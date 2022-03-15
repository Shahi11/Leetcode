class Solution {
    public int lengthOfLongestSubstring(String s) {
    
      
       Map<Character, Integer> map = new HashMap<>();
        int nstart = 0, start = -1 , max = 0;
        for(int i = 0 ;  i <s.length(); i++){
           if(map.containsKey(s.charAt(i))){
               nstart = map.get(s.charAt(i));
               start = Math.max(start,nstart);
           }
               max = Math.max(max, i-start);
              map.put(s.charAt(i),i);
             
        }
        
        return max;
    }
}