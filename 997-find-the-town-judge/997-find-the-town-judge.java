class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(trust.length < n-1) return -1;
        
        int[] in = new int[n+1];
        
        for(int[] t : trust){
            in[t[0]]--;
            in[t[1]]++;
        }
        
        for(int i =1; i<= n; i++){
            if(in[i] == n-1)
                return i;
        }
        
        return -1;
    }
}