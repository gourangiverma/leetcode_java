public class LC0079 {
    public boolean exist(char[][] board, String word) {
        // look for first letter
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0)) {
                    if(wordSearch(board, new boolean[board.length][board[0].length], word, 1, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    // tries to form word from the given start point (x,y)
    public static boolean wordSearch(char[][] board, boolean[][] visited, String word, int i, int x, int y) {
        if(i==word.length()) return true;

        visited[x][y] = true;

        boolean up = (x > 0) && (!visited[x-1][y]) && (board[x-1][y]==word.charAt(i)) && wordSearch(board, visited, word, i+1, x-1, y);
        boolean down = (x < board.length-1) && (!visited[x+1][y]) && (board[x+1][y]==word.charAt(i)) && wordSearch(board, visited, word, i+1, x+1, y);;
        boolean left = (y > 0) && (!visited[x][y-1]) && (board[x][y-1]==word.charAt(i)) && wordSearch(board, visited, word, i+1, x, y-1);
        boolean right = (y < board[0].length-1) && (!visited[x][y+1]) && (board[x][y+1]==word.charAt(i)) && wordSearch(board, visited, word, i+1, x, y+1);

        // backtrack - to explore further possibilities
        visited[x][y] = false;

        // return their logical sum
        return up || down || left || right;
    }
}
