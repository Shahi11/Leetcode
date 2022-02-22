class Solution {
    
    int r,c;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        r = heights.length;
        c = heights[0].length;
        
        List<List<Integer>> res= new ArrayList<>();
        boolean[][] pacific = new boolean[r][c];
        boolean[][] atlantic= new boolean[r][c];
        
        for(int i = 0 ; i < r; i++){
            check(i,0,heights,Integer.MIN_VALUE, pacific);
            check(i,c-1,heights,Integer.MIN_VALUE, atlantic);
        }
        
        for(int j =0 ; j < c; j++){
            check(0,j,heights,Integer.MIN_VALUE, pacific);
            check(r-1,j,heights,Integer.MIN_VALUE, atlantic);
        }
        
        for(int i = 0 ; i < r; i++){
            for(int j = 0; j < c; j++){
                if(atlantic[i][j] && pacific[i][j])
                    res.add(Arrays.asList(i,j));
            }
        }
        
        return res;
    }
    
    
    public void check(int i, int j, int[][] heights,int prev, boolean[][] ocean){
        
        if(i < 0 || j <0 || i >= r || j >= c ) return;
        
        if(heights[i][j] < prev || ocean[i][j]) return;
        
        ocean[i][j] = true;
        
        check(i+1,j,heights,heights[i][j],ocean);
        check(i-1,j,heights,heights[i][j],ocean);
        check(i,j+1,heights,heights[i][j],ocean);
        check(i,j-1,heights,heights[i][j],ocean);
    }
}