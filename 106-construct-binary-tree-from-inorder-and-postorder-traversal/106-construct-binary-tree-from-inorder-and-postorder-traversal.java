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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < inorder.length; i++)
            map.put(inorder[i],i);
        
        return check(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
    }
    
    public TreeNode check(int[] inorder, int istart, int iend,
                         int[] postorder, int pstart, int pend, Map<Integer, Integer> map){
        
        if(istart > iend || pstart > pend)
            return null;
        
        TreeNode root = new TreeNode(postorder[pend]);
        int diff = map.get(root.val);
        int left = diff - istart;
        
        root.left = check(inorder, istart, diff-1, postorder, pstart, pstart+left-1, map);
        
        root.right = check(inorder, diff+1, iend, postorder, pstart+left, pend-1, map);
        
        
        return root;
    }
}