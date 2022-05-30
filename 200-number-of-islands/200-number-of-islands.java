class Solution {
    
   
    int row;
    int col;
    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int count =0;
    for(int i = 0; i < row; i++){
        for(int j = 0; j< col; j++){
            if(grid[i][j] == '1'){
                countIsland(i,j,grid);
                count++;
            }
        }
        
      
    }  
          return count;
        
    }
    
    public void countIsland(int r, int c, char[][] grid){
        
        if(r<0 || r >= row || c < 0 || c >= col || grid[r][c] == '0')
            return;
        
        grid[r][c] = '0';
        
        countIsland(r+1,c,grid);
        countIsland(r-1,c,grid);
        countIsland(r,c+1,grid);
        countIsland(r,c-1,grid);
    }
}