class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
  
        int[] topo = new int[numCourses];
        int[] indeg = new int[numCourses];
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0 ; i <numCourses; i++)
            adj.add(new ArrayList<>());
        
 
        
        for(int[] i : prerequisites){
            indeg[i[1]]++;
            adj.get(i[0]).add(i[1]);
        }
               
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < numCourses; i++){
            if(indeg[i] == 0)
                q.add(i);                
        }
        
        int c = 0;
        while(!q.isEmpty()){
            c++;
            int n = q.poll();
            for(int i : adj.get(n)){
                indeg[i]--;
                if(indeg[i] == 0)
                    q.add(i);
            }
        }
        
        return c == numCourses;

    }
}

