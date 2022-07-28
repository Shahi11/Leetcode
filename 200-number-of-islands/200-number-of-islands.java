class Solution {
    int row, col;
    public int numIslands(char[][] grid) {
        
        row = grid.length;
        col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    checkIsland(i,j,grid);
                }
            }
        }
        
        return count;
        
    }
    
    public void checkIsland(int r, int c, char[][] grid){
        
        if(r < 0 || r >= row || c < 0 || c >= col || grid[r][c] == '0')
            return;
        
        grid[r][c] = '0';
        checkIsland(r+1, c, grid);
        checkIsland(r-1, c, grid);
        checkIsland(r, c+1, grid);
        checkIsland(r, c-1, grid);
    }
}