class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int r = grid.length;
        int c = grid[0].length;
        
        int[] rmax = new int[r];
        int[] cmax = new int[c];
        for(int i = 0 ; i < r; i++){
            for(int j = 0; j< c; j++){
                rmax[i] = Math.max(rmax[i],grid[i][j]);
                cmax[j] = Math.max(cmax[j], grid[i][j]);
            }
        }
        
        int sum =0;
          for(int i = 0 ; i < r; i++){
            for(int j = 0; j< c; j++){
                int temp = grid[i][j];
                grid[i][j] = Math.min(rmax[i],cmax[j]);
                sum += (grid[i][j]- temp);
            }
        }
        
        return sum;
        
        
    }
}