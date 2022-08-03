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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < inorder.length; i++)
            map.put(inorder[i], i);
        
        return check(inorder, 0 , inorder.length-1, preorder, 0, preorder.length-1, map);
        
        
    }
    
    public TreeNode check(int[] inorder, int istart, int iend, int[] preorder
                         , int pstart, int pend, Map<Integer, Integer> map){
        
        if(istart > iend || pstart > pend)
            return null;
        
       
        TreeNode root = new TreeNode(preorder[pstart]);
        
         int diff = map.get(root.val);
        int leftnum = diff - istart;
        
        root.left = check(inorder, istart, diff-1, preorder, pstart+1, pstart+leftnum, map);
        
         root.right = check(inorder, diff+1 , iend, preorder, pstart+leftnum+1, pend, map);
        
        return root;
        
        
    }
}