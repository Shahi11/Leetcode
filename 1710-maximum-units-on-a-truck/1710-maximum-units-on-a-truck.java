class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        
        int res = 0;
        for(int[] box : boxTypes){
            int put = Math.min(truckSize, box[0]);
            
            truckSize = truckSize - put;
        
            res = res+(put*box[1]);
              if(truckSize == 0)
                break;
        }
        
        return res;
        
    }
}