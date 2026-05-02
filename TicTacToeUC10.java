public class TicTacToeUC10 {

    // Method to check draw condition
    public static boolean checkDraw(char[][] board) {

        // Traverse the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any empty cell exists, game is not draw
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // No empty cells found, match is draw
        return true;
    }

    // Main method
    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };

        // Check draw
        if (checkDraw(board)) {
            System.out.println("Game is Draw!");
        } else {
            System.out.println("Moves still remaining.");
        }
    }
}
