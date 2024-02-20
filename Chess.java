public class Chess {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();
    }
    
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    @Override
    public void moves(){
        System.out.println("Up, Down, Left, Right, Digonal");
    }
}
class Rook implements ChessPlayer{
    @Override
    public void moves(){
        System.out.println("Up, Down, Left, Right");
    }
}
class King implements ChessPlayer{
    @Override
    public void moves(){
        System.out.println("Up, Down, Left, Right, Digonal(by 1 step)");
    }
}
 