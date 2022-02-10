class Solution {
    public int arrangeCoins(int n) {
        
        int i = 1, count =0;
        while(n/i >=1){
            n = n -i;
            count += 1;
            i++;
        }
        
        return count;
    }
}