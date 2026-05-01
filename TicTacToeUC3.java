import java.util.Random;
import java.util.Scanner;

public class TicTacToeUC3 {

    // Method to take user input
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

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

        // Toss to decide first player
        Random random = new Random();

        int toss = random.nextInt(2);

        char userSymbol;
        char computerSymbol;
        String currentPlayer;

        if (toss == 0) {
            userSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = "User";

            System.out.println("\nUser won the toss!");
        } else {
            userSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = "Computer";

            System.out.println("\nComputer won the toss!");
        }

        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("Current Player: " + currentPlayer);

        // Accept user slot input
        int userSlot = getUserInput();

        // Display entered slot
        System.out.println("User selected slot: " + userSlot);
    }
}
