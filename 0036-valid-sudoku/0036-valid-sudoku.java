class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        String row,col,box;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                row=board[i][j]+"r"+i;
                col=board[i][j]+"c"+j;
                box=board[i][j]+"b"+(i/3)+""+(j/3);
                if(board[i][j]!='.'){
                    if(set.contains(row)||set.contains(col)||set.contains(box)){
                        return false;
                    }
                    set.add(row); set.add(col); set.add(box);
                }
            }
        }
        return true;
    }
}