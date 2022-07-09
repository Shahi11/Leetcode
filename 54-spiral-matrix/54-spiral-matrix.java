class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int t= 0, l =0, b = row-1, r = col-1; 
        List<Integer> res = new ArrayList<>();
        
        while(res.size() < row*col){
            for(int i = l; i <= r; i++){
                res.add(matrix[t][i]);
            }

            for(int i = t+1; i <= b; i++)
                res.add(matrix[i][r]);
            
 
            
            if(t != b ){
                for(int i = r-1; i >= l; i--)
                    res.add(matrix[b][i]);
            }
            
            if(l != r){
                for(int i = b-1; i > t; i--)
                    res.add(matrix[i][l]);
            }
            
            t++;
            r--;
            b--;
            l++;
                
            
        }
        
        return res;
        
    }
}