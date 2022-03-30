class Solution {
    public int minAddToMakeValid(String s) {
   
        Stack<Character> st = new Stack<>();
        int count = 0;
        
     
        for(char c : s.toCharArray()){
            if(!st.isEmpty()){
                char cc = st.peek();
                if(cc == '(' && c == ')'){
                    st.pop();
                      continue;
                }
                else{
                    st.push(c);
                }
            }
            else{
                st.push(c);
            }
            
        }
        
        return st.size();
    }
}