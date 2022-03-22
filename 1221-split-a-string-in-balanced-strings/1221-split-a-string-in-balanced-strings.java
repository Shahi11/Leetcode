class Solution {
    public int balancedStringSplit(String s) {
        
        int count = 0;
        int L = 0, R = 0;
        
        for(char c : s.toCharArray()){
            if(c == 'L')
                L++;
            if(c == 'R')
                R++;
            if(L == R)
                count++;
        
        }
        
        return count;
    }
}