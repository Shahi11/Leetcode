class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String p : patterns){
            if(word.indexOf(p) >= 0)
                count++;
        }
        
        return count;
        
    }
}