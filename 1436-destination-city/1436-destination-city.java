class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hs = new HashSet<>();
        for(List<String> i: paths){
            hs.add(i.get(0));
        }
        
        for(List<String> i : paths){
            if(!hs.contains(i.get(0)))
                return i.get(0);
            else if(!hs.contains(i.get(1)))
                return i.get(1);
        }
        return null;
    }
}