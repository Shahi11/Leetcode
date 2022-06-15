class pair{
    int num;
    int count;
    pair(int n, int c){
        num = n;
        count = c;
    }
}

class Solution {
    public long subArrayRanges(int[] arr) {
          
        int n = arr.length;
        long[] minLeft = new long[n];
        long[] minRight = new long[n];
        long[] maxLeft = new long[n];
        long[] maxRight = new long[n];
        
        ArrayDeque<pair> q = new ArrayDeque<>();
        
        for(int i = 0 ; i < n; i++){
            int cur = arr[i];
            int cnt = 1;
            
            while(q.size() != 0 && q.peek().num > cur){
                cnt += q.pop().count;
            }
            q.push(new pair(cur,cnt));
            minLeft[i] = cnt;
        }
        
        q.clear();
        
        for(int i = n-1; i >= 0 ; i--){
            int cur = arr[i];
            int cnt=1;
            
            while(q.size() != 0 && q.peek().num >= cur){
                cnt += q.pop().count;
            }
            q.push(new pair(cur,cnt));
            minRight[i] = cnt;
        }
        
        q.clear();
       for(int i = 0 ; i < n; i++){
            int cur = arr[i];
            int cnt = 1;
            
            while(q.size() != 0 && q.peek().num < cur){
                cnt += q.pop().count;
            }
            q.push(new pair(cur,cnt));
            maxLeft[i] = cnt;
        }
        
        q.clear();
        
        for(int i = n-1; i >= 0 ; i--){
            int cur = arr[i];
            int cnt=1;
            
            while(q.size() != 0 && q.peek().num <= cur){
                cnt += q.pop().count;
            }
            q.push(new pair(cur,cnt));
            maxRight[i] = cnt;
        }
        
        
        long res = 0; 
        for (int i = 0; i < n; i++)
            res += arr[i] * ((maxLeft[i]*maxRight[i]) - (minLeft[i]*minRight[i]));
        return res;
    }
}