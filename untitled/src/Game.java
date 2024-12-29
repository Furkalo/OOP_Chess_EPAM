public class Game {
    private int id;
    private Player[] players;
    private String[] history;
    private boolean status;

    public void start() {
        System.out.println("Starting the game.");
    }

    public void save() {
        System.out.println("Saving the game.");
    }

    public void load() {
        System.out.println("Loading the game.");
    }

    public void recordMove() {
        System.out.println("Recording a move.");
    }
}

