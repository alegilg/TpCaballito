package TpCaballito;

public class Board {
    Board[][] board;

    int initialPositionX = 1;
    int initialPositionY = 1;

    Horse horse =  new Horse(initialPositionX,initialPositionY);
    Position position;


    public Board(Board[][] board) {
        this.board = board;
    }


    public void tryMoves(){
        for (int i = 0; i < horse.moveset.size() ; i++) {

        }

    }

}
