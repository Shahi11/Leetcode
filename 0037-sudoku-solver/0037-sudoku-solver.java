class Solution {
    public void solveSudoku(char[][] board) {
        soduku(board,0,0);
    }
    
    public boolean soduku(char[][] grid, int row, int col){

        if (row == 8 && col == 9)
            return true;

        if (col == 9) {
            row++;
            col = 0;
        }

        if (grid[row][col] != '.')
            return soduku(grid, row, col + 1);
 
        for (int num = 1; num < 10; num++) {
 

            if (isSafe(grid, row, col, (char)(num+'0'))) {

                grid[row][col] = (char)(num+'0');
 

                if (soduku(grid, row, col + 1))
                    return true;
            }

            grid[row][col] = '.';
        }
        return false;
    }
    
    public boolean isSafe(char[][] grid, int row, int col, char num){
        
            for (int x = 0; x <= 8; x++)
            if (grid[row][x] == num)
                return false;

        for (int x = 0; x <= 8; x++)
            if (grid[x][col] == num)
                return false;

        int startRow = row - row % 3, startCol
                                      = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j + startCol] == num)
                    return false;
        return true;
    }
    
}