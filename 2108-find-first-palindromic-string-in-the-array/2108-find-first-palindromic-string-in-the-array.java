class Solution {
    public String firstPalindrome(String[] words) {
        for(String s: words){
            if(checkpallindrome(s))
                return s;
        }
        return "";
    }
    
    public boolean checkpallindrome(String s){
        int i = 0 , j = s.length()-1;
        char[] ch = s.toCharArray();
        while(i<=j){
            if(ch[i] != ch[j])
                return false;
            
            i++;
            j--;
        }
        return true;
    }
}