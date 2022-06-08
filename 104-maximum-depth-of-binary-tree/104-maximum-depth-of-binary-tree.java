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
class Solution {
    int max;
    public int maxDepth(TreeNode root) {
        max = 0;
        recursion(root, 1);
        
        return max;
    }
    
    public void recursion(TreeNode node, int level){
        
        if(node == null)
            return;
        
        max = Math.max(max, level);
        
        if(node.left != null)
            recursion(node.left, level+1);
        
        if(node.right != null)
            recursion(node.right, level+1);
        
    }
}