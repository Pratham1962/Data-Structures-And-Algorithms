class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public static boolean solve(char[][] board){
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(board[i][j]=='.'){
                    for(int k=1;k<=9;k++){
                        char ch = (char) (k + '0');

                        if(valid(ch,i,j,board)){
                            board[i][j]=ch;

                            if(solve(board)==true) return true;

                            else board[i][j]='.';
                        }
                    }

                    return false;
                }
            }        
        }

        return true;
    }

    public static boolean valid(char ch, int row, int col, char[][] board){
        for(int i=0;i<9;i++){
            if(board[i][col]==ch) return false;

            if(board[row][i]==ch) return false;

        }

        int gridRow = (row/3)*3;
       int gridCol = (col/3)*3;
       
       for(int x=gridRow;x<gridRow+3;x++){
           for(int y=gridCol;y<gridCol+3;y++){
               if(board[x][y]==ch){
                   return false;
               }
           }
       }

        return true;
    }
}
