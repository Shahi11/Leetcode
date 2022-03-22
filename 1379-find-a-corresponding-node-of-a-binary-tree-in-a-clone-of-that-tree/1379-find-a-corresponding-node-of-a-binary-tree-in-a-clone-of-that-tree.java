class Solution {
    
    TreeNode ans;
    public TreeNode inorder(TreeNode o, TreeNode c, TreeNode target) {
        if (o != null) {
            inorder(o.left, c.left, target);
            if (o == target) {
                ans = c;    
            }
            inorder(o.right, c.right, target);    
        }
        return ans;
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
     
        
        return inorder(original, cloned, target);
    }
}