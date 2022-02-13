class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int a=0 ,b =0;
        
        for(int al : aliceSizes) a += al;
        for(int bo : bobSizes) b += bo;
        
        int d = (b-a)/2;
        
        HashSet<Integer> hs = new HashSet<>();
        for(int x : bobSizes ) hs.add(x);
        
        for(int y : aliceSizes){
            if(hs.contains(y+d))
                return new int[]{y,y+d};
        }
        return null;
    }
}