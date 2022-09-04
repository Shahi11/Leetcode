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
    TreeNode p1 = null, p2 = null;
    int l1 = -1, l2 = -1;
    public boolean isCousins(TreeNode root, int x, int y) {
        
        check(root, x, y, 0, null);
        
        return (l1 == l2 && p1.val != p2.val);
        
    }
    
    public void check(TreeNode node, int x, int y, int l, TreeNode p){
        
        if(node == null)
            return;
        
        if(node.val == x){
             p1 = p;
            l1 = l;
        }
        if(node.val == y){
             p2 = p;
            l2 = l;
        }
        
        check(node.left, x, y, l+1, node);
        check(node.right, x, y, l+1, node);
     
    }

}


