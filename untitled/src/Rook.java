import MoveBehavior.RookMove;

public class Rook extends Piece {
    public Rook(){
        MoveBehavior = new RookMove();
    }
    @Override
    public void display() {
        System.out.println("Rook moves");
    }
}
