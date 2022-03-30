class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        int[] alpha = new int[26];
        for(char c : s.toCharArray()){
              System.out.println(c-'a');
            alpha[c-'a']++;
        }
        
       int max = Arrays.stream(alpha).max().getAsInt();
        for(int i = 0 ; i < 25; i++){
            
            if(alpha[i] != 0 && alpha[i] != max)
                return false;
        }
        
        return true;
    }
}