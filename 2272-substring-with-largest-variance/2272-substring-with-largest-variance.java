class Solution {
    public int largestVariance(String s) {
        
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        
        int max  = 0;
        for(int i = 0 ; i < 26; i++){
            for(int j = 0 ; j < 26; j++){
                int freqi = freq[i];
                int freqj = freq[j];
                
                if(freqi == 0 || freqj == 0 || i == j)
                    continue;
                
                for(int k = 0 ; k < 2; k++){
               int curfreqi = 0 , curfreqj = 0;
                for(char c : s.toCharArray()){
                    if(i == (c - 'a')){
                        curfreqi++;
                    }
                    if(j == (c - 'a')){
                        curfreqj++;
                    }
                    
                    if(curfreqi < curfreqj){
                        curfreqi = curfreqj = 0;
                    }
                    
                    if(curfreqi > 0 && curfreqj > 0){
                        max = Math.max(max, curfreqi - curfreqj);
                    }
             
                        
                }
                           
                    StringBuilder st = new StringBuilder();
                    st.append(s);
                    s = st.reverse().toString();
                    
                }
            }
        }
        
        return max;
        
        
    }
}