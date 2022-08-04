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
 
  
    public TreeNode bstFromPreorder(int[] preorder) {
           
        
        return rec(preorder, Integer.MAX_VALUE, new int[]{0});
    }
    
    public TreeNode rec(int[] ls, int bound, int[] index){
        if(index[0] == ls.length || ls[index[0]] > bound)
            return null;
        
        
        TreeNode root = new TreeNode(ls[index[0]++]);
        
        root.left = rec(ls, root.val, index);
        root.right = rec(ls, bound, index);
        
        return root;
        
    }
}