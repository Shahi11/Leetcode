class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
  
        boolean[] visit = new boolean[numCourses];
        boolean[] dfsvisit = new boolean[numCourses];
        Arrays.fill(visit, false);
        Arrays.fill(dfsvisit, false);
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0 ; i <numCourses; i++)
            adj.add(new ArrayList<>());
        
        for(int[] i : prerequisites){
            adj.get(i[0]).add(i[1]);
        }
        
        for(int i = 0 ; i < numCourses; i++){
            if(cycle(i, adj, visit, dfsvisit))
                return false;
        }
        
        return true;
  

    }
    
    public boolean cycle(int node, ArrayList<ArrayList<Integer>> adj,  boolean[] visit,
                        boolean[] dfsvisit){
        visit[node] = true;
        dfsvisit[node] = true;
        
        for(int it : adj.get(node)){
            if(visit[it] == false){
                if(cycle(it, adj, visit, dfsvisit))
                    return true;
            }
        else{
            if(dfsvisit[it] == true)
                return true;
            }
        }
        dfsvisit[node] = false;
        return false;
            
    }
}

