class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        int slen = s.length();
        int tlen = t.length();
        
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(char ss : s.toCharArray()){
            if(ss != '#')
                st1.push(ss);
            else if(ss == '#' && st1.size() != 0)
                st1.pop();
        }
        
        
        for(char tt : t.toCharArray()){
            if(tt != '#')
                st2.push(tt);
             else if(tt == '#' && st2.size() != 0)
                st2.pop();
        }
        
        
        
        
        
        
        

        
        if((st1.toString()).equals(st2.toString()))
            return true;
        
        return false;
    }
}