public class Main {
    public static void main(String[] args) {


        Game game = new Game();
        Board board = new Board();
        Player player1 = new Player();
        AIPlayer aiPlayer = new AIPlayer();
        MoveValidator validator = new MoveValidator();

        game.start();
        board.display();
        player1.move();
        aiPlayer.generateMove();
        if (validator.isValidMove()) {
            game.recordMove();
        }

        Piece pawn = new Pawn();
        pawn.performMoveBehavoir();
        pawn.display();
        pawn.performTransformationBehavior();

        Piece bishop = new Bishop();
        bishop.performMoveBehavoir();
        bishop.display();

        Piece rook = new Rook();
        rook.performMoveBehavoir();
        rook.display();
        game.save();



    }
}