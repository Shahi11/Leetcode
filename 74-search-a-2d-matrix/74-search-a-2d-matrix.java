class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        int s = 0, e = r*c-1;
        
        while(s<=e){
            
            int m = (s+e)/2;
            
            int data = matrix[m/c][m%c];
            
            if(data == target)
                return true;
            
            else if(data > target)
                e = m-1;
            else
                s = m+1;
        }
        
        return false;
        
    }
}