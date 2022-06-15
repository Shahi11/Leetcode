class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int sum = 0;
        for(int[] box : boxTypes){
            int count = Math.min(box[0],truckSize);
            sum += count * box[1];
            truckSize -= count;
        }
        
        return sum;
    }
}