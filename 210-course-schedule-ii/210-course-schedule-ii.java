class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0 ; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
      
         int[] indir = new int[numCourses];
        for(int[] i : prerequisites){
            adj.get(i[1]).add(i[0]);
            indir[i[0]]++;
        }
            

        Queue<Integer> st = new LinkedList<>();
        
        for(int i = 0; i < numCourses; i++){
            if(indir[i] == 0)
             st.add(i);   
        }
        
        int[] res = new int[numCourses];
         int count = 0;
        while(!st.isEmpty()){
            int node = st.poll();
            res[count++] = node;
            for(int i : adj.get(node)){
                indir[i]--;
                if(indir[i] == 0)
                    st.add(i);
            }
        }
        
     
        if(count < numCourses)
            return new int[]{};

        return res;
        
        
    }
}