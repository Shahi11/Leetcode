class Solution {
    public int lastStoneWeight(int[] stones) {
     
     
        while(stones.length-1>0){
            Arrays.sort(stones);
            int smash = stones[stones.length-1] - stones[stones.length-2];
            if(smash != 0){
                stones = Arrays.copyOf(stones,stones.length-1);
                stones[stones.length-1] = smash; 
            }
            else{
                stones = Arrays.copyOf(stones,stones.length-2);
            }
           
        }
        
        return stones.length == 0? 0: stones[0];
   
    }
}