class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] sol = new int[s.length()];
        int index = Integer.MIN_VALUE/2;
        for(int i = 0 ; i < s.length(); ++i){
            if(s.charAt(i) == c) index = i;
            sol[i] = i-index;
        }
        
         index = Integer.MAX_VALUE/2;
        for(int i = s.length()-1 ; i >=0; --i){
            if(s.charAt(i) == c) index = i;
            sol[i] = Math.min(index-i,sol[i]);
        }
        
        return sol;
    }
}