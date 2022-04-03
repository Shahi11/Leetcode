class Solution {
    public String sortString(String s) {
     
        int[] alp = new int[26];
        
        for(char c : s.toCharArray())
            alp[c-'a']++;
        
        int n = s.length();
        StringBuilder sc = new StringBuilder();
        while(sc.length() != n){
          
            for(int i = 0; i < alp.length; i++){
               
                if(alp[i] > 0){
                    char c = (char) (i + 'a');
                    sc.append(c);
                    alp[i]--;
                    
                }
            }
           
            for(int i = alp.length-1; i >= 0; i--){
                
                if(alp[i] > 0){
                    char c = (char) (i + 'a');
                    sc.append(c);
                     alp[i]--;
                }
            }
            System.out.println(sc.toString());
                
        }
        
        return sc.toString();
      
        
    }
}