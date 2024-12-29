import MoveBehavior.PawnMove;
import TransformationBehavior.QueenTransformation;

public class Pawn extends Piece {
    public Pawn(){
        MoveBehavior = new PawnMove();
        TransformationBehavior = new QueenTransformation();
    }
    @Override
    public void display() {
        System.out.println("Pawn moves");
    }
}
