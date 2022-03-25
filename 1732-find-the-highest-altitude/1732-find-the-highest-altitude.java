class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0, temp = 0;

        for (int each: gain) {
            temp += each;
            max = Math.max(max, temp);
        }

        return max;

    }
}