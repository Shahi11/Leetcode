class Solution {
    
    int r,c;
    public int numIslands(char[][] grid) {
        r = grid.length;
        c = grid[0].length;
        int count =0;
        for(int i = 0 ; i < r; i++){
            for(int j = 0 ; j < c; j++){
                if(grid[i][j] == '1'){
                    island(grid,i,j);
                    count++;
                }
            }
        }
        
        return count;
        
    }
    
    public void island(char[][] grid, int n , int m){
        
        if(n <0 || m <0 || n >= r || m >= c ||
          grid[n][m] == '0') return;
        grid[n][m] = '0';
        island(grid,n+1,m);
        island(grid,n-1,m);
        island(grid,n,m+1);
        island(grid,n,m-1);
    }
        
   
    
}