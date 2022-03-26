class Solution {
    public int compress(char[] chars) {
        
    int i = 0, j =1, freq = 1;
        
        
        while(j <= chars.length){
            if( j != chars.length && chars[j] == chars[j-1])
                freq++;
                
            else{
                chars[i++] = chars[j-1];
                if(freq>1){
                String f = String.valueOf(freq);
                for(int k = 0 ;  k < f.length(); k++)
                    chars[i++] = f.charAt(k);
                }
                
                freq=1;
            }
            
            j++;
        }
        
        return i;
    }
}