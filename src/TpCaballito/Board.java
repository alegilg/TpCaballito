package TpCaballito;

public class Board {
    Board[][] board = new Board[8][8];

    int initialPositionX = 0;
    int initialPositionY = 0;


    Horse horse =  new Horse(initialPositionX,initialPositionY);
    Position position = new Position(8);

    public Board(Board[][] board) {
        this.board = board;
    }


    public void tryMoves(){
        for (int i = 0; i < board.length ; i++) {


        }

    }

}
