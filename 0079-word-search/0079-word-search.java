class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                 if( findWord(i,j,0,board,word)) return true;
                }
            }
        }
        return false;
        
    }
    boolean findWord(int row,int col,int index,char[][]board,String word){
        if(index==word.length()){
            return true;
        }

        if(row<0 ||row>=board.length||col<0||col>=board[0].length){
            return false;
        }
        if(board[row][col]!=word.charAt(index))return false;

        //mark visited by changing char
        char temp=board[row][col];
        board[row][col]='%';

        //up direction
        if(findWord(row-1,col,index+1,board,word))return true;
        //down
        if(findWord(row+1,col,index+1,board,word))return true;

        //left
       if( findWord(row,col-1,index+1,board,word)) return true;

        //right
        if(findWord(row,col+1,index+1,board,word))return true;

        board[row][col]=temp;
        return false;
    }
}