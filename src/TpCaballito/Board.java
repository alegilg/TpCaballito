package TpCaballito;

import java.util.ArrayList;
import java.util.List;

public class Board {

    int initialPositionX = 0;
    int initialPositionY = 0;


    Horse horse =  new Horse(initialPositionX,initialPositionY);
    Position position = new Position(8);
    Position position2 = new Position(8);
    Position position3 = new Position(8);
    Position position4 = new Position(8);

    List<String> move1 = new ArrayList<>();
    List<String> move2 = new ArrayList<>();
    List<String> move3 = new ArrayList<>();

    public Board(int x, int y) {
      int [][] board = new int[x][y];

    }

//    public void killHorse(){
//        if(horse.getPositionX() > 8 && horse.getPositionY() > 8 && horse.getPositionX() < 0 && horse.getPositionX() < 0){
//            horse.setPositionX(Integer.parseInt(null));
//            horse.setPositionY(Integer.parseInt(null));
//        }
//    }

    public  List tryMoves(){
        String s = "";
        for (int i = 0; i < horse.moveset.size() ; i++) {
            horse.changePosition(horse.moveset.get(i));
            if(horse.getPositionX()>0 & horse.getPositionY()>0 & horse.getPositionY()<=7 & horse.getPositionX()<=7 ){
               position.push(horse.moveset.get(i));
               tryMoves2();
               s = "{" + horse.getPositionX() + ";" + horse.getPositionY() + "}";
               move1.add(s);
                }
            horse.backToPosition(horse.moveset.get(i));

            }

            return move1;

    }

    public List tryMoves2() {
        String s = "";
        for (int i = 0; i < horse.moveset.size(); i++) {
            horse.changePosition(horse.moveset.get(i));
            if (horse.getPositionX() >= 0 & horse.getPositionY() >= 0 & horse.getPositionY() <= 7 & horse.getPositionX() <= 7) {
                position2.push(horse.moveset.get(i));
                tryMoves3();
                s = "{" + horse.getPositionX() + ";" + horse.getPositionY() + "}";
                move2.add(s);


            }
            horse.backToPosition(horse.moveset.get(i));

        }
        if (move2.containsAll(move1)) {
            move2.removeAll(move1);
        }
        return move2;
    }

    public List tryMoves3() {
        String s = "";
        for (int i = 0; i < horse.moveset.size(); i++) {
            horse.changePosition(horse.moveset.get(i));
            if (horse.getPositionX() >= 0 & horse.getPositionY() >= 0 & horse.getPositionY() <= 7 & horse.getPositionX() <= 7) {
                position3.push(horse.moveset.get(i));
                //tryMoves4();
                s= "{" + horse.getPositionX() + ";" + horse.getPositionY() + "}";
                move3.add(s);

            }
            horse.backToPosition(horse.moveset.get(i));



        }

        if(move3.containsAll(move2)){move3.removeAll(move2);}
        if(move3.containsAll(move1)){move3.removeAll(move1);}
        return move3;
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
