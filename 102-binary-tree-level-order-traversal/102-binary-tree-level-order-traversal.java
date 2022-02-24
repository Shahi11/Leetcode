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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        LinkedList<TreeNode> ls = new LinkedList<>();
        ls.add(root);
        while(!ls.isEmpty()){
         
            List<Integer> tmp = new ArrayList<>();
            int size = ls.size();
            for(int i = 0 ; i<size;i++){
                TreeNode curr = ls.remove();
                tmp.add(curr.val);
            
                if(curr.left != null){
                    ls.add(curr.left);
                }
                if(curr.right != null){
                    ls.add(curr.right);
                }
            }
            
            result.add(tmp);
            
        }
        
        
        return result;
    }
}