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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> st = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        
        if(root == null)
            return res;
        
        TreeNode cur = root;
        
        st.add(cur);
        
        while(!st.isEmpty()){
            
            cur = st.pollLast();
            if(cur.left != null)
                st.add(cur.left);
            if(cur.right != null)
                st.add(cur.right);
            res.addFirst(cur.val);
                
        }
        
        
        return res;
        
    }
}