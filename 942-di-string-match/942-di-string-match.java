class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int lo = 0 , hi = s.length();
        
        int[] res = new int[n+1];
        int i =0;
        for(char c:s.toCharArray()){
            if(c == 'I')
                res[i++] = lo++;
            else
                res[i++] = hi--;
        }
        res[n] = lo;
        return res;
    }
}