class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        Arrays.sort(logs,(a,b) ->  {
            
            //log  a > log b -1
            // log a = log b 0
            // log a < log b 1
            int ind1 = a.indexOf(" ");
            String id1 = a.substring(0,ind1);
            String main1 = a.substring(ind1+1);
                        
            int ind2 = b.indexOf(" ");
            String id2 = b.substring(0,ind2);
            String main2 = b.substring(ind2+1);
            
            boolean isDigit1 = Character.isDigit(main1.charAt(0));
            boolean isDigit2 = Character.isDigit(main2.charAt(0));
            
            if(!isDigit1 && !isDigit2){
                int diff = main1.compareTo(main2);
                if(diff == 0 )
                    return id1.compareTo(id2);
                return diff;
            }
            
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
            
            
        });
        
        
        return logs;
    }
}