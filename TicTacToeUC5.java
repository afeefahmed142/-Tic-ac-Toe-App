public class TicTacToeUC5 {

    // Method to validate user move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check whether row and column are within bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check whether the cell is empty
        if (board[row][col] != ' ') {
            return false;
        }

        // Move is valid
        return true;
    }

    public static void main(String[] args) {

        // Create Tic-Tac-Toe board
        char[][] board = {
                {'X', 'O', ' '},
                {' ', 'X', ' '},
                {'O', ' ', ' '}
        };

        int row = 1;
        int col = 0;

        // Validate move
        if (isValidMove(board, row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }
}
