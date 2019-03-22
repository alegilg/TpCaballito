package TpCaballito;

public class Test
{
    public static void main(String[] args) {
        Board board = new Board(7,7);

        System.out.println(board.tryMoves());
        System.out.println(board.tryMoves2());
        System.out.println(board.tryMoves3());
        System.out.println(board.tryMoves4());

    }
}
