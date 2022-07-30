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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        if(root == null)
            return result;
        
        TreeNode cur = root;
        Stack<TreeNode> st = new Stack<>();
        
        while(cur != null || !st.isEmpty()){
            
            while(cur != null){
                st.push(cur);
                cur = cur.left;
            }
            
            cur = st.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        
        return result;
        
            
        
    }
}