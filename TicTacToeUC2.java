import java.util.Random;

public class TicTacToeUC2 {

    public static void main(String[] args) {

        // Create game board
        char[][] board = new char[3][3];

        // Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Display empty board
        System.out.println("Empty Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // Random toss to decide first player
        Random random = new Random();

        // 0 -> User starts, 1 -> Computer starts
        int toss = random.nextInt(2);

        char userSymbol;
        char computerSymbol;
        String currentPlayer;

        if (toss == 0) {
            userSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = "User";

            System.out.println("\nUser won the toss!");
            System.out.println("User Symbol: " + userSymbol);
            System.out.println("Computer Symbol: " + computerSymbol);
            System.out.println("User will play first.");
        } else {
            userSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = "Computer";

            System.out.println("\nComputer won the toss!");
            System.out.println("Computer Symbol: " + computerSymbol);
            System.out.println("User Symbol: " + userSymbol);
            System.out.println("Computer will play first.");
        }

        // Store current player information
        System.out.println("\nCurrent Player: " + currentPlayer);
    }
}
