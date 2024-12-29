import MoveBehavior.BishopMove;

public class Bishop extends Piece {
    public Bishop(){
        MoveBehavior = new BishopMove();
    }
    @Override
    public void display() {
        System.out.println("Bishop moves");
    }
}