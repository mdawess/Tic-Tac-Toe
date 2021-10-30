import java.util.Objects;

public class CheckWinner {

    Board board;

    public CheckWinner(Board board) {
        this.board = board;
    }

    public boolean isWinner(Player player) {
        return verticalWinner(player) || horizontalWinner(player) || diagonalWinner(player);
    }

    private boolean diagonalWinner(Player player) {
        return (Objects.equals(this.board.gameBoard[0][0], player.team) &&
                Objects.equals(this.board.gameBoard[1][1], player.team) &&
                Objects.equals(this.board.gameBoard[2][2], player.team)) ||
                (Objects.equals(this.board.gameBoard[2][0], player.team) &&
                        Objects.equals(this.board.gameBoard[1][1], player.team) &&
                        Objects.equals(this.board.gameBoard[0][2], player.team));
    }

    private boolean horizontalWinner(Player player) {
        for (int row = 0; row < 3; row++) {
            int inARow = 0;
            for (int col = 0; col < 3; col++) {
                if (Objects.equals(this.board.gameBoard[row][col], player.team)) {
                    inARow++;
                }
            }
            if (inARow == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean verticalWinner(Player player) {
        for (int col = 0; col < 3; col++) {
            int inACol = 0;
            for (int row = 0; row < 3; row++) {
                if (Objects.equals(this.board.gameBoard[row][col], player.team)) {
                    inACol++;
                }
            }
            if (inACol == 3) {
                return true;
            }
        }
        return false;
    }
}
