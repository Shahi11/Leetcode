class Solution {
    public int[] sumZero(int n) {
        
        int[] res = new int[n];
        if(n%2 == 0){
            for(int i = 0; i < n/2; i++){
                res[i] = -(i+1);
                res[i+n/2] = i+1;
            }
        }
        else{
            for(int i = 0; i< n/2; i++){
                res[i] = -(i+1);
                res[i+n/2+1] = i+1;
            }
            res[n/2] = 0;
        }
        
        return res;
    }
}