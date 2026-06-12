class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans= new ArrayList<>();

        char [][] board= new char [n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(board[i],'.');
        findPostion(board,0,new ArrayList<>(),ans);
        return ans;

	}
    void findPostion(char [][]board,int row,List<String> curr,List<List<String>>ans){
        if(row==board.length){
            ans.add(new ArrayList<>(curr));
            return;
        }


        for(int col=0;col<board.length;col++){
            if(isSafe(row,col,curr)){
                board[row][col]='Q';
                String s= new String (board[row]);
                curr.add(s);
                findPostion(board,row+1,curr,ans);
                curr.remove(curr.size()-1);
                board[row][col]='.';
            }
        }
        

    }
    boolean isSafe(int row,int col,List<String>curr){
        boolean safe=true;
        for(int i=0;i<curr.size();i++){
            int queenColumn=curr.get(i).indexOf('Q');
            boolean sameCol=(col==queenColumn);
            boolean diagonal=Math.abs(row-i)==Math.abs(col-queenColumn);
            if(sameCol||diagonal)safe=false;
        }
        return safe;
    }
        
    
}