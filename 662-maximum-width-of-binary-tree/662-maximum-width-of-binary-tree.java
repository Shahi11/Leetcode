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

public class tuple{
    TreeNode n;
    int index;
    
    tuple(TreeNode n, int index){
        this.n = n;
        this.index = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        int max = 0 ;
        
        Queue<tuple> q = new LinkedList<>();
        
        q.add(new tuple(root,0));
        while(!q.isEmpty()){
            
            int size = q.size();
            int min = q.peek().index;
            int start = 0, end = 0;
            for(int i = 0; i < size; i++){
                tuple t = q.poll();
                int curi = t.index-min;
                if(i==0)
                    start = curi;
                if(i == size-1)
                    end = curi;
                
                if(t.n.left != null){
                    q.add(new tuple(t.n.left, curi*2+1));
                     }
            
                if(t.n.right != null){
                    q.add(new tuple(t.n.right, curi*2+2));
                }
            }
            
           max = Math.max(max, end-start+1) ;
        }
                                
        return max;
    }
}