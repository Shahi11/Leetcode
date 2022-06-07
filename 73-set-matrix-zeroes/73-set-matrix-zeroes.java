class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        int fr = 1, fc = 1;
        
        for(int i = 0; i < r; i++){
            if(matrix[i][0] == 0){
                fc = 0;
                break;
            }
        }
        
       for(int i = 0; i < c; i++){
            if(matrix[0][i] == 0){
                fr = 0;
                break;
            }
        }
        
        
        for(int i = 0 ; i < r ; i++){
            for(int j = 0; j < c; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i = 1; i < r; i++){
            for(int j = 1; j < c; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] =0;
            }
        }
        
        if(fc == 0){
            for(int i = 0; i<r; i++)
                matrix[i][0] = 0;
        }
        
        if(fr == 0){
            for(int i = 0; i < c; i++){
                matrix[0][i] = 0;
            }
        }
            
        
    }
}