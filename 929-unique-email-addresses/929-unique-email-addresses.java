class Solution {
    public int numUniqueEmails(String[] emails) {
        
        
        HashSet<String> hs = new HashSet<>();
        
        for(String e : emails){
            int in = e.indexOf("@");
            String main = e.substring(0,in);
            String domain = e.substring(in);
            
            if(main.contains("+")){
                main = main.substring(0,main.indexOf("+"));
            }
            
            main = main.replaceAll("\\.","");
            String name = main+domain;
            System.out.println(name);
            hs.add(name);
        }
        
        return hs.size();
    }
}