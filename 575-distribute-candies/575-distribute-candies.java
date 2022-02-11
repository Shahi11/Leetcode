class Solution {
    public int distributeCandies(int[] candyType) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        if(candyType.length == 0) return 0;
        
        int type = 0;
        int max = candyType.length/2;
        
        for(int i : candyType){
            if(hs.contains(i)){
                continue;
            }
            
            else{
                hs.add(i);
                type++;
            }
        }
        
        return Math.min(type,max);
    }
}