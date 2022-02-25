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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        
        else if(isSameTree(root,subRoot))
            return true;
        
        else return (isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot));
    }
    
    public boolean isSameTree(TreeNode t1, TreeNode t2){
        if(t1 == null || t2  == null)
            return (t1==null && t2 == null);
        else if (t1.val == t2.val){
            return (isSameTree(t1.left, t2.left) && isSameTree(t1.right,t2.right)); 
        }
         return false;
    }
}