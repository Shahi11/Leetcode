class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a = coordinates.charAt(0);
        char b = coordinates.charAt(1);
        
        if(b%2 ==0 && (a == 'a' || a == 'c' || a == 'e' || a == 'g'))
            return true;
        else if(b%2 !=0 && (a == 'b' || a == 'd' || a == 'f' || a == 'h'))
            return true;
        
        return false;
        
    }
}