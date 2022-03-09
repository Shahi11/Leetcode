class Solution {
  public int[][] transpose(int[][] matrix) {
        //Dimensions
        int n=matrix[0].length;
        
        //result matrix (size from transposition)
        int transpose[][] = new int[matrix[0].length][matrix.length];
        
        //Iterate through "matrix.length"
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                //transposing
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

}