package TpCaballito;

public class Horse {
    int positionX;
    int positionY;

    public Horse(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void moveTo(int X,int y)
    {
        positionX = X;
        positionY = y;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
