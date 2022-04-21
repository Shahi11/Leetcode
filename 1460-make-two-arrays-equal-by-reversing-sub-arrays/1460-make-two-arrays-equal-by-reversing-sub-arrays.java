class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : target){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i : arr){
            if(!map.containsKey(i))
                return false;
            else{
                if(map.get(i) == 1)
                    map.remove(i);
                else
                map.put(i,map.get(i)-1);
            }
        }
        
        return map.size() == 0 ;
    }
}