class Solution {
    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length+1];
        res[0] = 0;
        int i =1;
        for(int ind : gain){
            res[i] = res[i-1]+ind;
            i++;
        }
        return Arrays.stream(res).max().getAsInt();
    }
}