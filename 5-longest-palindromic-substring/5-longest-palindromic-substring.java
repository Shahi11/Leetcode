class Solution {
    public String longestPalindrome(String s) {
    int len = s.length();
    int st = 0, e =0;
    for(int i = 0; i < len; i++){
        
        int l1 = checkPallindrome(i,i,s);
        int l2 = checkPallindrome(i,i+1,s);
        int l = Math.max(l1,l2);
        if(l > e-st){
            e = i+l/2;
            st = i-((l-1)/2);
        }
    }
        
     return s.substring(st,e+1);   
        
    }
    
    public int checkPallindrome(int s, int e, String ss){
        int count = 0;
        while(s>=0 && e<ss.length() && ss.charAt(s)==ss.charAt(e)){
            s--;
            e++;
        }
        
        return e-s-1;
    } 
}