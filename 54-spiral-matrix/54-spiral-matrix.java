class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0, r = matrix[0].length-1, t = 0, b = matrix.length-1;
        
        while(res.size() < row*col){
            for(int i = l; i <= r; i++)
                res.add(matrix[t][i]);
            
          
            for(int i = t+1; i <= b; i++)
                res.add(matrix[i][r]);
            
          
            if(t != b){
            for(int i = r-1; i >= l; i--)
                res.add(matrix[b][i]);
            }
            
            if(l != r){
            for(int i = b-1; i > t; i--)
                res.add(matrix[i][l]);
            }
            l++;
            t++;
            r--;
            b--;
        }
        
        return res;
        
    }
}