class Solution {
    
    boolean[][] visited;
    int r,c;
    public boolean exist(char[][] board, String word) {
      r = board.length; c = board[0].length;
        visited = new boolean[r][c];
        for(int i = 0; i< r ; i++){
            for(int j = 0; j< c; j++){
                if(board[i][j] == word.charAt(0) && visited(i,j,0,board,word))
                    return true;
            }
        }
        
        return false;
    }
    
    
    public boolean visited(int i, int j, int index, char[][] board, String word){
        
        if(word.length() == index) return true;
        
        if(i <0 || j < 0 || i >= r || j >= c ||
          board[i][j] != word.charAt(index) || visited[i][j])
            return false;
        
        visited[i][j] = true;
        
        if(
            visited(i+1,j,index+1,board,word) ||
            visited(i-1,j,index+1,board,word) ||
            visited(i,j+1,index+1,board,word) ||
            visited(i,j-1,index+1,board,word))
            return true;
        
        visited[i][j] = false;
        return false;
    }
}