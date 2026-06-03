class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Check rows
        for (int r = 0; r < board.length; r++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                if (board[r][i] == '.') continue;
                if (seen.contains(board[r][i])) return false;
                seen.add(board[r][i]);
            }
        }
        //Check cols
        for (int c = 0; c < board.length; c++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                if (board[i][c] == '.') continue;
                if (seen.contains(board[i][c])) return false;
                seen.add(board[i][c]);
            }
        }
        //Check boxes
        for (int b = 0; b < board.length; b++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int r = (b / 3) * 3 + i;
                    int c = (b % 3) * 3 + j;
                    if (board[r][c] == '.') continue;
                    if (seen.contains(board[r][c])) return false;
                    seen.add(board[r][c]);
                }
            }
        }
        return true;
    }
}
