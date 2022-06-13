class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] alpha = new int[26];
        
        int start = 0, length = 0, max = 0;
        
        
        for(int end = 0; end < s.length(); end++){
            
            char c = s.charAt(end);
            
            alpha[c - 'A']++;
            max = Math.max(max, alpha[c-'A']);
            
            while(end - start - max+1 > k){
                alpha[s.charAt(start)-'A']--;
                start++;
            }
            
            length = Math.max(length, end-start+1);
        }
        
        return length;
    }
}