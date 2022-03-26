class Solution {

    int deepest = Integer.MIN_VALUE;
    TreeNode answer = null;
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        postorder(root, 0);
        return answer;
    }
    
    public int postorder(TreeNode root, int level){
        
        if(root == null){
            return level;
        }
        
        int left = postorder(root.left, level + 1);
        int right = postorder(root.right, level + 1);
        
        if(left == right){
            deepest = Math.max(deepest, left);
            if(deepest == left){
                answer = root;
            }
        }
        
        return Math.max(left, right);
    }
}