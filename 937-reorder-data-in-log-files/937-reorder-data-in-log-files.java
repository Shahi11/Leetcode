class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,(a,b) -> {
           // log1 < log2 -1
            // log1 == log2 0
            //log1 > log 2 1
            int index1 = a.indexOf(" ");
            String id1 = a.substring(0,index1);
            String main1 = a.substring(index1+1);
            
            int index2 = b.indexOf(" ");
            String id2 = b.substring(0,index2);
            String main2 = b.substring(index2+1);
            
            boolean isDigit1 = Character.isDigit(main1.charAt(0));
            boolean isDigit2 = Character.isDigit(main2.charAt(0));
            
            if(!isDigit1 && !isDigit2){
                int diff = main1.compareTo(main2);
                if(diff == 0) return id1.compareTo(id2);
                return diff;
            }
            
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1; 
            
        });
        
        return logs;
    }
}