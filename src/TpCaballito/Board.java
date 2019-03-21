package TpCaballito;

public class Board {
    Board[][] board = new Board[8][8];

    int initialPositionX = 0;
    int initialPositionY = 0;


    Horse horse =  new Horse(initialPositionX,initialPositionY);
    Position position = new Position(8);
    Position position2 = new Position(8);
    Position position3 = new Position(8);
    Position position4 = new Position(8);

    public Board(Board[][] board) {
        this.board = board;
    }

//    public void killHorse(){
//        if(horse.getPositionX() > 8 && horse.getPositionY() > 8 && horse.getPositionX() < 0 && horse.getPositionX() < 0){
//            horse.setPositionX(Integer.parseInt(null));
//            horse.setPositionY(Integer.parseInt(null));
//        }
//    }

    public void tryMoves(){
        for (int i = 0; i < horse.moveset.size() ; i++) {
            horse.changePosition(horse.moveset.get(i));
            if(horse.getPositionX()>0 & horse.getPositionY()>0 & horse.getPositionY()<=8 & horse.getPositionX()<=8 ){
               position.push(horse.moveset.get(i));
               tryMoves2();
               horse.backToPosition(horse.moveset.get(i));
                }


            }

    }

    public void tryMoves2() {
        for (int i = 0; i < horse.moveset.size(); i++) {
            horse.changePosition(horse.moveset.get(i));
            if (horse.getPositionX() >= 0 & horse.getPositionY() >= 0 & horse.getPositionY() <= 7 & horse.getPositionX() <= 7) {
                position2.push(horse.moveset.get(i));
                tryMoves3();
                horse.backToPosition(horse.moveset.get(i));
            }

        }
    }

    public void tryMoves3() {
        for (int i = 0; i < horse.moveset.size(); i++) {
            horse.changePosition(horse.moveset.get(i));
            if (horse.getPositionX() >= 0 & horse.getPositionY() >= 0 & horse.getPositionY() <= 7 & horse.getPositionX() <= 7) {
                position3.push(horse.moveset.get(i));
                tryMoves4();
                horse.backToPosition(horse.moveset.get(i));
            }
        }
    }

    public void tryMoves4() {
        for (int i = 0; i < horse.moveset.size(); i++) {
            horse.changePosition(horse.moveset.get(i));
            if (horse.getPositionX() >= 0 & horse.getPositionY() >= 0 & horse.getPositionY() <= 7 & horse.getPositionX() <= 7) {
                position4.push(horse.moveset.get(i));
                horse.backToPosition(horse.moveset.get(i));
            }
        }
    }

}
