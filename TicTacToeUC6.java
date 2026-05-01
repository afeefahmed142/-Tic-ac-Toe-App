public class TicTacToeUC6 {

    // Method to place move on the board
    public static void placeMove(char[][] board, int row, int col, char symbol) {

        // Place the symbol at the given position
        board[row][col] = symbol;
    }

    // Method to display the board
    public static void displayBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create empty Tic-Tac-Toe board
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // Place moves
        placeMove(board, 0, 0, 'X');
        placeMove(board, 1, 1, 'O');

        // Display updated board
        displayBoard(board);
    }
}
