class Solution {
    boolean[][] visited;
    public int maxAreaOfIsland(int[][] grid) {
        int ar=0;
        visited = new boolean[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                ar = Math.max(ar,area(i,j,grid));
            }
        }
        
        return ar;
    }
    
    
    public int area(int i, int j, int[][] grid){
        
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] 
          || grid[i][j] == 0)
            return 0;
        
        visited[i][j] = true;
        
        return(1+area(i+1,j,grid)+area(i-1,j,grid)+area(i,j+1,grid)+area(i,j-1,grid));
        
        
    }
}