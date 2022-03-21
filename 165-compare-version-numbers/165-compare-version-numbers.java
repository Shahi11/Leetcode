class Solution {
    public int compareVersion(String version1, String version2) {
        
        if(version1.equals(version2)) return 0;
        
        String[] st1 = version1.split("\\.");
        String[] st2 = version2.split("\\.");
        int min = Math.min(st1.length, st2.length);
        
        for(int i = 0 ;  i < min; i++){
            String sver1 = stripleadingzero(st1[i]);
            String sver2 = stripleadingzero(st2[i]);
            // System.out.println(sver1);
            // System.out.println(sver2);
            int sn1 = sver1 == "" ? 0 : Integer.parseInt(sver1);
            int sn2 = sver2 == "" ? 0 : Integer.parseInt(sver2);
            
            if(sn1 > sn2)
                return 1;
            else if(sn2 > sn1)
                return -1;
        }
        
        if(st1.length > min){
            for(int i = min ; i < st1.length; i++){
                String rver1 = stripleadingzero(st1[i]);
                int rsn1 = rver1 == "" ? 0 : Integer.parseInt(rver1);
                if(rsn1 != 0)
                    return 1;
            }
        }
        
         if(st2.length > min){
            for(int i = min ; i < st2.length; i++){
                String rver2 = stripleadingzero(st2[i]);
                int rsn2 = rver2 == "" ? 0 : Integer.parseInt(rver2);
                if(rsn2 != 0)
                    return -1;
            }
        }
        
        
        return 0;
    }
    
    public String stripleadingzero(String st){
        int index = 0 ; 
        while(index < st.length() && st.charAt(index) == '0')
            index++;
        
        return index == st.length() ? "" : st.substring(index);
    }
}