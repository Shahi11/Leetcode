class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        Map<Character, Integer> map = new HashMap<>();
        int start = -1, nstart =0, len =0;
        for(int i=0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                nstart = map.get(s.charAt(i));
                start = Math.max(nstart, start);
            }
            len = Math.max(len,i-start);
            map.put(s.charAt(i),i);
        }
        
        return len;
        

    }
}