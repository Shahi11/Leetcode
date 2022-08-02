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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        
        if(root == null)
            return res;
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode n = q.remove();
                if(n.left != null)
                    q.add(n.left);
                if(n.right != null)
                    q.add(n.right);
            
                if(flag){
                    temp.add(n.val);
                }
                else
                    temp.addFirst(n.val);
                
            }
            flag = !flag;
            res.add(temp);
        }
        
        
        return res;
        
    }
}