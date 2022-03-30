class Solution {
    public boolean areOccurrencesEqual(String s) {
	//create an array to track frequencies of characters
        int[] trackerArray = new int[26];
        for(int i=0;i<s.length();i++){
            trackerArray[s.charAt(i)-'a']++;
        }
 //if the min and max occurrences of the characters are different, we return false.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<trackerArray.length;i++){
		// Since the array was initialized with 0 values, we only check indexes with non zero position
            if(trackerArray[i]>0){
            min = Math.min(trackerArray[i],min);
            max = Math.max(trackerArray[i],max);
        }
        }
        
        return min == max;
    }
}