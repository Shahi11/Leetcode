class Solution {
    public int lastStoneWeight(int[] stones) {
     
        
        while(stones.length > 1){
            Arrays.sort(stones);
            int sum = stones[stones.length-1] - stones[stones.length-2];
            
            if(sum >0){
                stones = Arrays.copyOf(stones,stones.length-1);
                stones[stones.length-1] = sum;
            }
            else{
                stones = Arrays.copyOf(stones,stones.length-2);
            }
        }
        
        return stones.length == 0 ? 0 : stones[0];
    }
}