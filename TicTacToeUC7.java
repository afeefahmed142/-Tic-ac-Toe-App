import java.util.Random;

public class TicTacToeUC7 {

    // Method to convert slot number to row index
    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    // Method to convert slot number to column index
    public static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        return board[row][col] == ' ';
    }

    // Method to place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to display board
    public static void displayBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Method for computer random move
    public static void computerMove(char[][] board) {

        Random random = new Random();

        while (true) {

            // Generate random slot between 1 and 9
            int slot = random.nextInt(9) + 1;

            // Convert slot to row and column
            int row = getRow(slot);
            int col = getCol(slot);

            // Check validity
            if (isValidMove(board, row, col)) {

                // Place computer symbol
                placeMove(board, row, col, 'O');

                System.out.println("Computer selected slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        // Create empty board
        char[][] board = {
                {'X', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // Display before move
        System.out.println("Board Before Computer Move:");
        displayBoard(board);

        // Computer move
        computerMove(board);

        // Display after move
        System.out.println("\nBoard After Computer Move:");
        displayBoard(board);
    }
}
