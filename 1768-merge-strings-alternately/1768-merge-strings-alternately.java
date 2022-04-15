class Solution {
    public String mergeAlternately(String word1, String word2) {
     
        int l1 = word1.length();
        int l2 = word2.length();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int i = 0, j = 0;
        StringBuilder st = new StringBuilder();
        
        while(i < l1 || j < l2){
            if(i < l1 && j < l2){
                st.append(w1[i++]);
                st.append(w2[j++]);
            }
            
            else if(i < l1)
                st.append(w1[i++]);
            else
                st.append(w2[j++]);
        }
        
        return st.toString();
    }
}