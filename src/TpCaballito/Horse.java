package TpCaballito;

import java.util.ArrayList;
import java.util.List;

public class Horse {
    int positionX;
    int positionY;


    //moveset del caballo
    Vector vector1 = new Vector(2,1);
    Vector vector2 = new Vector(2,-1);
    Vector vector3 = new Vector(-2,1);
    Vector vector4 = new Vector(-2,-1);
    Vector vector5 = new Vector(1,2);
    Vector vector6 = new Vector(1,-2);
    Vector vector7 = new Vector(-1,2);
    Vector vector8 = new Vector(-1,-2);

    List<Vector> moveset = new ArrayList<>();


    public Horse(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        moveset.add(vector1);
        moveset.add(vector2);
        moveset.add(vector3);
        moveset.add(vector4);
        moveset.add(vector5);
        moveset.add(vector6);
        moveset.add(vector7);
        moveset.add(vector8);

    }

    public void changePosition(Vector vector)
    {
        positionX = positionX + vector.getX();
        positionY = positionY + vector.getY();
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public List getMoves()
    {
        return moveset;
    }
}
