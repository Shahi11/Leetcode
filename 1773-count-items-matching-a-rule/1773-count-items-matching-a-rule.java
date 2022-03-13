class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0 ; 
        
        for(List<String> cur: items){
            if(ruleKey.equals("type") && cur.get(0).equals(ruleValue)){
                c++;
            }
            if(ruleKey.equals("color") && cur.get(1).equals(ruleValue)){
                c++;
            }
            else if(ruleKey.equals("name") && cur.get(2).equals(ruleValue)){
                c++;
            }
        }
        
        return c;
    }
}