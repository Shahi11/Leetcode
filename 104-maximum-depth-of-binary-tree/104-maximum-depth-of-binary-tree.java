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
    int level;
    TreeNode n;
    
    tuple(int level, TreeNode n){
        this.level = level;
        this.n = n;
    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        
        int max = 1;
        
        Queue<tuple> q = new LinkedList<>();
        q.add(new tuple(1,root));
        
        while(!q.isEmpty()){
            tuple t = q.remove();
            
            if(t.n.left != null){
                q.add(new tuple(t.level+1,t.n.left));
                max = Math.max(max, t.level+1);
            }
            
            if(t.n.right != null){
                q.add(new tuple(t.level+1,t.n.right));
                max = Math.max(max, t.level+1);
            }
            
        }
        
        return max;
        
        
    }
}