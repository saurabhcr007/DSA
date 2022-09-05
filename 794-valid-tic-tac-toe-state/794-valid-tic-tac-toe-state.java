class Solution {
    public boolean didXWin(String[] board){
    for(String row : board)
        if(row.equals("XXX"))
            return true;
    
    for(int i = 0; i < 3; i++)
        if(board[0].charAt(i) == 'X' && board[1].charAt(i) == 'X' && board[2].charAt(i) == 'X')
            return true;
    
    if(board[0].charAt(0) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(2) == 'X')
        return true;
    
    if(board[0].charAt(2) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(0) == 'X')
        return true;
    
    return false;
}

public boolean didOWin(String[] board){
    for(String row : board)
        if(row.equals("OOO"))
            return true;
    
    for(int i = 0; i < 3; i++)
        if(board[0].charAt(i) == 'O' && board[1].charAt(i) == 'O' && board[2].charAt(i) == 'O')
            return true;
    
    if(board[0].charAt(0) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(2) == 'O')
        return true;
    
    if(board[0].charAt(2) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(0) == 'O')
        return true;
    
    return false;
}

public boolean validTicTacToe(String[] board) {
    int countX = 0, countO = 0;
    
    boolean didXWin = didXWin(board),
            didOWin = didOWin(board);
    
    if(didXWin && didOWin)
        return false;
    
    for(String row : board){
        for(char ch : row.toCharArray()){
            if(ch == 'O')
                countO++;
            else if(ch == 'X')
                countX++;
        }
    }
    
    if(didXWin){
        return countO == countX - 1;
    }
    
    if(didOWin){
        return countO == countX;
    }
    
    return countO == countX || countO == countX - 1;
}
}