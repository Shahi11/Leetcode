class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
       for(String s : sentences){
           String[] tmp = s.split(" ");
           max =Math.max(max,tmp.length);
       } 
        
        return max;
    }
}