public class Board {

    public String[][] gameBoard;

    public Board() {
        this.gameBoard = new String[][]{{"-", "-", "-"},
                                        {"-", "-", "-"},
                                        {"-", "-", "-"}};
    }

    public void printBoard() {

        System.out.println(this.gameBoard[0][0] + "|" + this.gameBoard[0][1] + "|" + this.gameBoard[0][2]);
        System.out.println("-----");
        System.out.println(this.gameBoard[1][0] + "|" + this.gameBoard[1][1] + "|" + this.gameBoard[1][2]);
        System.out.println("-----");
        System.out.println(this.gameBoard[2][0] + "|" + this.gameBoard[2][1] + "|" + this.gameBoard[2][2]);
    }
}
