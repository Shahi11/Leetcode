class Solution {
    int r, c;
    
    public int maxAreaOfIsland(int[][] grid) {
        
        r = grid.length;
        c = grid[0].length;
        
        int count = 0;
        for(int i = 0 ; i < r; i++){
            for(int j = 0 ; j < c; j++){
                if(grid[i][j] == 1)
                    count = Math.max(count, check(i,j,grid));
            }
        }
        
        return count;
        
    }
    
    
    public int check(int i, int j, int[][] grid){
        
        if(i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == 0)
            return 0;
        
        grid[i][j] = 0;
        return (1+ check(i+1,j,grid) +
        check(i-1,j,grid) +
        check(i,j+1,grid) +
        check(i,j-1,grid) );
    }
}