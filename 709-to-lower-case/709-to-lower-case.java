class Solution {
    public String toLowerCase(String s) {
        
        StringBuilder st = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z')
                st.append((char)('a'+(c-'A')));
            else
                st.append(c);
        }
        return st.toString();
    }
}