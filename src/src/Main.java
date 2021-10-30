import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static final Board board = new Board();

    public static void main(String[] args) {

        Player player1 = new Player("X");
        Player player2 = new Player("O");
        boolean win = true;

        board.printBoard();
        
        while (win) {
            System.out.println("Where would you like to play? 1-9");
            Scanner playerTurn = new Scanner(System.in);
            int location1 = playerTurn.nextInt();

            makeMove(player1, location1);
            board.printBoard();

            int location2 = ThreadLocalRandom.current().nextInt(1, 9);
            makeMove(player2, location2);

            System.out.println("");
            System.out.println("----OPPONENT TURN----");
            System.out.println("");
            board.printBoard();

            if (location1 == 10) {
                win = false;
            }
        }
        
    }

    public static int getCol(int location, int row) {

        return location - 3 * row;
    }

    public static void makeMove(Player player, int location) {

        ArrayList<ArrayList<Integer>> moves = new ArrayList<ArrayList<Integer>>();

        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                if (Objects.equals(board.gameBoard[row][col], "-") && col == getCol(location, row)) {
                    board.gameBoard[row][col] = player.team;
                }
            }
        }
    }

    public void win() {

        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                if (Objects.equals(board.gameBoard[row][col], "-")) {
                    System.out.println("hi");
                }
            }
        }
    }
}

