class Solution {
    public String reverseWords(String s) {
        
        int i = 0 ; 
        int n = s.length();
        String res = "";
        
        while(i < n){
            
            while(i < n && s.charAt(i) == ' ') i++;
            int j = i+1;
            if(i >= n)
                break;
            while(j < n && s.charAt(j) != ' ') j++;
            
            String w = s.substring(i,j);
            if(res == "") res= w;
            else
                res = w+ " " + res;
            
            i = j+1;
        }
        
        return res;
    }
}