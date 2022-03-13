class Solution {
    public String sortSentence(String s) {
        String[] sp = s.split(" ");
        String[] res = new String[sp.length];
        for(String ss: sp){
            int index = ss.charAt(ss.length()-1) - '0';
            res[index-1] = ss.substring(0,ss.length()-1);
        }
       StringBuilder sb = new StringBuilder();
        for(String n : res)
            sb.append(n + " ");
        
        return sb.toString().substring(0,sb.toString().length()-1);
        
    }
}