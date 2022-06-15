class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        int res = 0;
        
        for(int[] i : boxTypes){
            
            if(truckSize == 0)
                break;
            
            if(i[0] < truckSize){
                res += i[0]*i[1];
                truckSize -= i[0];
                System.out.println(res + "1");
            }
            else{
                res += truckSize*i[1];
                truckSize = 0;
                    System.out.println(res + "2");
            }
        }
        
        return res;
    }
}