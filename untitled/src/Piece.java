import MoveBehavior.MoveBehavior;
import TransformationBehavior.TransformationBehavior;

public abstract class Piece {
    protected int x;
    protected int y;
    protected boolean isWhite;
    MoveBehavior MoveBehavior;
    TransformationBehavior TransformationBehavior;

    public abstract void display();
    public void performMoveBehavoir (){
        MoveBehavior.move();
    }
    public void performTransformationBehavior (){
        TransformationBehavior.transform();
    }

    public String getMoveNotation() {
        return "Move notation";
    }
}
