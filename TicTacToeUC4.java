import java.util.Scanner;

public class TicTacToeUC4 {

    // Method to convert slot number into row and column
    public static int[] convertSlotToIndex(int slot) {

        // Convert slot (1-9) into zero-based index
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        // Return row and column as array
        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get slot number from user
        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        // Convert slot to board index
        int[] index = convertSlotToIndex(slot);

        // Display row and column
        System.out.println("Row Index : " + index[0]);
        System.out.println("Column Index : " + index[1]);

        sc.close();
    }
}
