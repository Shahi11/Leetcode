class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     
        
        if(prerequisites == null || prerequisites.length == 0) return true;
        
        int[] ind = new int[numCourses];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for(int[] pre : prerequisites){
            ind[pre[0]]++;
            if(!map.containsKey(pre[1])){
                List<Integer> ls = new ArrayList<>();
                ls.add(pre[0]);
                map.put(pre[1],ls);
            }
            else{
                map.get(pre[1]).add(pre[0]);
            }
            
        }
        
        LinkedList<Integer> que = new LinkedList<>();
        
        for(int i = 0 ; i < ind.length ; i++){
            if(ind[i] == 0)
                que.add(i);
        }
        
        while(!que.isEmpty()){
            List<Integer> tmp = map.get(que.poll());
            
            for(int i =0; tmp != null && i < tmp.size();i++){
                ind[tmp.get(i)]--;
                if(ind[tmp.get(i)] == 0) que.add(tmp.get(i));
            }
            
        }
        
        for(int i:ind){
            if(i != 0) return false;
        }
        
        return true;
        
        
    }
}