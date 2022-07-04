class Solution {
    public String longestPalindrome(String s) {
        
       int left = 0, right = 0; 
        for(int i = 0 ; i < s.length(); i++){
            int l1 = palli(i,i+1,s);
            int l2 = palli(i,i,s);
            int l = Math.max(l1,l2);
        if(l > right - left){
            left = i - (l-1)/2;
            right = i + l/2;
            
        }
        }
        
        return s.substring(left, right+1);
    }
    
    public int palli(int l, int r, String s){
        
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }

        return r-l-1;
    }
}