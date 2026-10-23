class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(!isSafe(i,j,board[i][j],board)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSafe(int row,int col,int num,char[][] board){
        // chack the row 
        for(int i=0;i<board.length;i++){
            if(row == i){
                continue;
            }else{
                if(board[i][col] == num){
                return false;
            }
            }  
        }
        // check the col
        for(int i=0;i<board.length;i++){
            if(col == i){
                continue;
            }else{
                if(board[row][i] == num){
                return false;
            }
            }  
        }
        // check 3*3 matrix
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if((i != row || j != col)&&board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
