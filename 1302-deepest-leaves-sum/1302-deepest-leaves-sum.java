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
    int max = 0, sum = 0;
    public int deepestLeavesSum(TreeNode root) {
         rec(root,0);
        return sum;
    }
    
    public void rec(TreeNode root, int level){
        if(root == null) return;
        if(level > max){
            sum = 0;
            max = level;
        }
        if(level == max){
             sum += root.val;
        }

        rec(root.left, level+1);
        rec(root.right, level+1);
    }
}