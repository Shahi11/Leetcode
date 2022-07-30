/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class tuple{
    
    TreeNode n;
    int level;
    int vert;
    
    tuple(TreeNode n, int level, int vert){
        this.n = n;
        this.level = level;
        this.vert = vert;
    }
    
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
       
        
        Queue<tuple> q = new LinkedList<>();
        
        q.add(new tuple(root,0,0));
        
        while(!q.isEmpty()){
            tuple t = q.poll();
            
            if(!map.containsKey(t.vert))
                map.put(t.vert,new TreeMap<>());
            if(!map.get(t.vert).containsKey(t.level))
                map.get(t.vert).put(t.level, new PriorityQueue<>());
            //System.out.println("Level " + t.n);
            map.get(t.vert).get(t.level).add(t.n.val);
            
            if(t.n.left != null){
                q.add(new tuple(t.n.left,t.level+1, t.vert-1));
            }
            
            if(t.n.right != null){
                q.add(new tuple(t.n.right,t.level+1, t.vert+1));
            }
            
        }
        
        List<List<Integer>> res = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> v : map.values()){
            res.add(new ArrayList<>());
            for(PriorityQueue<Integer> l : v.values()){
                while(!l.isEmpty())
                    res.get(res.size()-1).add(l.poll());
            }
        }
        
        return res;
        
        
        
        
    }
}