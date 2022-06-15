class pair{
    int num;
    int count;
    pair(int n, int c){
        num = n;
        count = c;
    }
}

class Solution {
    
     public int mod = (int)Math.pow(10,9)+7;
    public int sumSubarrayMins(int[] arr) {
        
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
       
        
        ArrayDeque<pair> q1 = new ArrayDeque<>();
        ArrayDeque<pair> q2 = new ArrayDeque<>();
        
        for(int i = 0 ; i < n; i++){
            int cur = arr[i];
            int cnt = 1;
            
            while(q1.size() != 0 && q1.peek().num > cur){
                cnt += q1.pop().count;
            }
            q1.push(new pair(cur,cnt));
            left[i] = cnt;
        }
        
        for(int i = n-1; i >= 0 ; i--){
            int cur = arr[i];
            int cnt=1;
            
            while(q2.size() != 0 && q2.peek().num >= cur){
                cnt += q2.pop().count;
            }
            q2.push(new pair(cur,cnt));
            right[i] = cnt;
        }
        
        
        long res = 0, mod = (int)Math.pow(10,9)+7;
        for (int i = 0; i < n; i++)
            res = (res + (long)arr[i] * left[i] * right[i] ) % mod;
        return (int)res;
    }
}


// No. of subarrays of n length = n (n+1) /2
