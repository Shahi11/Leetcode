class Solution {
    public int maxProfit(int[] prices) {
    
        int min = Integer.MAX_VALUE, maxP = 0;
        
        for(int i : prices){
            min = Math.min(min,i);
            maxP =Math.max(maxP, i -min);
        }
        
        return maxP;
    }
}