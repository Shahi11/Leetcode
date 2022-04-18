class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        return ((helper(firstWord) + helper(secondWord)) == helper(targetWord));
    }
    
    
    public int helper(String s){
        
        int temp=s.charAt(0)-'a';
        for(int i = 1; i< s.length(); i++){
            temp = temp*10 + s.charAt(i) -'a';
        }
        
        return temp;
    }
}