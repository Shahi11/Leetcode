class Solution {
    public String tictactoe(int[][] moves) {
        
        int n = 3;
        int[] row = new int[n];
        int[] col = new int[n];
        int diag = 0, adiag = 0;
        
        for(int i = 0; i < moves.length; i++){
            if(i%2 ==0){
                if(moves[i][0] == moves[i][1] && moves[i][0] != 1 ){
                    diag++;
                    System.out.println(diag);
                    if(diag == 3)
                        return "A";
                  
                }
                else if(moves[i][0] == n - moves[i][1]-1  && moves[i][0] != 1){
                    adiag++;
                    
                    if(adiag == 3)
                        return "A";
                }
                if(moves[i][0] == 1 && moves[i][1] == 1 ){
                    diag++;
                    adiag++;
                    System.out.println(diag);
                if(diag == 3 || adiag == 3)
                        return "A";
                }
                row[moves[i][0]]++;
                if(row[moves[i][0]] == 3) 
                    return "A";
                col[moves[i][1]]++;
                if(col[moves[i][1]] == 3) 
                    return "A";
            }
            else{
              //  System.out.println(moves[i][0]);
                if(moves[i][0] == moves[i][1] && moves[i][0] != 1){
                    diag--;
                    if(diag == -3)
                        return "B";
                  
                }
                else if(moves[i][0] == n - moves[i][1]-1  && moves[i][0] != 1 ){
                    adiag--;
                    if(adiag == -3)
                        return "B";
                }
                if(moves[i][0] == 1 && moves[i][1] == 1){
                    diag--;
                    adiag--;
                    if(diag == -3 || adiag == -3)
                        return "B";
                }
                row[moves[i][0]]--;
                 if(row[moves[i][0]] == -3) 
                    return "B";
                col[moves[i][1]]--;
                if(col[moves[i][1]] == -3) 
                    return "B";
            }
        }
        
        if(moves.length == 9)
            return "Draw";
        else
            return "Pending";
        
    }
    
//     public boolean check(int row[], int[] col, int key){
//         for(int i : row){
//             if(i == key)
//                 return true;
//         }
        
//         for(int i : col){
//             if(i == key)
//                 return true;
//         }
        
//         return false;
//     }
}