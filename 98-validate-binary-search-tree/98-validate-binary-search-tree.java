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
    public boolean isValidBST(TreeNode root) {
     
        return check(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    public boolean check(TreeNode node, long ub, long lb){
        
        if(node == null)
            return true;
        
        if(node.val >= ub || node.val <= lb)
            return false;
        
       return  check(node.left, node.val, lb) &&
        check(node.right, ub, node.val);
        
    
    }
}