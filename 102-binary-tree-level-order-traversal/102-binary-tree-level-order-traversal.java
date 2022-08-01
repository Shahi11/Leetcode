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
    TreeNode node;
    int level;
    tuple(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
        
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root == null)
            return res;
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<tuple> q = new LinkedList<>();
        q.add(new tuple(root,0));
        while(!q.isEmpty()){
            tuple t = q.remove();
            if(!map.containsKey(t.level)){
               map.put(t.level, new ArrayList<>()) ;
            }
            
            List<Integer> temp = map.get(t.level);
            temp.add(t.node.val);
            map.put(t.level, temp);
            
            if(t.node.left != null)
                q.add(new tuple(t.node.left,t.level+1));

            if(t.node.right != null)
                q.add(new tuple(t.node.right,t.level+1));
        }
  
        for(List<Integer> ls : map.values())
            res.add(ls);
            
        return res;
    }
}