class Solution {
    
    int row, col;
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        
        row = board.length;
        col = board[0].length;
        visited = new boolean[row][col];
        
        
        for(int i = 0; i < row; i++){
            for(int j = 0 ; j < col; j++){
                if(board[i][j] == word.charAt(0) && checkWord(i,j,board, word, 0)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    public boolean checkWord(int r, int c, char[][] board, String word, int index){
        
        
        if(index == word.length())
            return true;
        
        if(r < 0 || r >= row || c < 0 || c >= col || word.charAt(index) != board[r][c] || visited[r][c] == true)
            return false;
        
        visited[r][c] = true;
        
        if(checkWord(r+1,c, board, word, index+1) || 
           checkWord(r-1,c, board, word, index+1) ||
           checkWord(r,c+1, board, word, index+1)||
           checkWord(r,c-1, board, word, index+1)
          )
        return true;
        
         visited[r][c] = false;
        
        return false;
    }
    
    
}