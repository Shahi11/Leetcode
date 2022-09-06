class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            
            if( !st.isEmpty() && c == st.peek()){
                st.pop();
            }
            
            else{
                st.push(c);
            }
        }
        
        
        String sb = "";
        
        while(!st.isEmpty()){
            sb = st.pop() + sb;
        }
        
        
        return sb;
    }
}