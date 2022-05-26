class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        int start = -1, nstart = 0, max=0;
        
        for(int i=0; i< s.length(); i++){
            if(hs.containsKey(s.charAt(i))){
                nstart=hs.get(s.charAt(i));
                start=Math.max(start,nstart);
            }
              
            max = Math.max(max, i-start);
            hs.put(s.charAt(i),i);
        }
               
               
    return max;
        
    }
}