class Solution {
    public int[] processQueries(int[] queries, int m) {
        
        int[] ans=new int[queries.length];
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<m;i++){
            list.add(i+1);
        }
        
        for(int i=0;i<queries.length;i++){
            int index = list.indexOf(queries[i]);
            ans[i]=index;
            
            list.remove(index);
            list.add(0,queries[i]);
        }
        
        return ans;
    }
}