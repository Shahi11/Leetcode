class Solution {
    public int countNegatives(int[][] grid) {
        
        int count = 0;
        
        for(int i = grid.length-1; i >= 0; i--){
            int j = grid[0].length-1;
            while( j >=0 && grid[i][j] < 0){
                count++;
                j--;
            }
        }
        
        return count;
    }
}