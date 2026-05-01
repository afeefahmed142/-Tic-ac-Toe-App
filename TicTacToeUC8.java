import java.util.Random;
import java.util.Scanner;

public class TicTacToeUC8 {

    // Method to display board
    public static void displayBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Convert slot number to row
    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot number to column
    public static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    // Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        return board[row][col] == ' ';
    }

    // Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Check winner
    public static boolean checkWin(char[][] board, char symbol) {

        // Rows and columns
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }

            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) {
                return true;
            }
        }

        // Diagonals
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    // Check draw
    public static boolean checkDraw(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    // Computer random move
    public static void computerMove(char[][] board) {

        Random random = new Random();

        while (true) {

            int slot = random.nextInt(9) + 1;

            int row = getRow(slot);
            int col = getCol(slot);

            if (isValidMove(board, row, col)) {

                placeMove(board, row, col, 'O');

                System.out.println("Computer selected slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create empty board
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        boolean gameOver = false;

        // Game loop
        while (!gameOver) {

            // Display board
            displayBoard(board);

            // Player turn
            System.out.print("Enter slot (1-9): ");
            int slot = scanner.nextInt();

            int row = getRow(slot);
            int col = getCol(slot);

            // Validate player move
            if (!isValidMove(board, row, col)) {

                System.out.println("Invalid move! Try again.");
                continue;
            }

            // Place player move
            placeMove(board, row, col, 'X');

            // Check player win
            if (checkWin(board, 'X')) {

                displayBoard(board);
                System.out.println("Player wins!");
                gameOver = true;
                break;
            }

            // Check draw
            if (checkDraw(board)) {

                displayBoard(board);
                System.out.println("Game is a draw!");
                gameOver = true;
                break;
            }

            // Computer turn
            computerMove(board);

            // Check computer win
            if (checkWin(board, 'O')) {

                displayBoard(board);
                System.out.println("Computer wins!");
                gameOver = true;
                break;
            }

            // Check draw
            if (checkDraw(board)) {

                displayBoard(board);
                System.out.println("Game is a draw!");
                gameOver = true;
            }
        }

        scanner.close();
    }
}
