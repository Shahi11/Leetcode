class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder st = new StringBuilder();
        char[] w = s.toCharArray();
        
        for(char c : w){
            if(Character.isLetterOrDigit(c))
                st.append(Character.toLowerCase(c));
        }
        
        s = st.toString();

        
        return s.equals(st.reverse().toString());
    }
}