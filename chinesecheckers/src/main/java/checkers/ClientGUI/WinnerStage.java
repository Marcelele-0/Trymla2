package checkers.ClientGUI;

public class WinnerStage extends InfoStage {
    
    private int playerNumber;

    public WinnerStage(int playerNumber) {
        this.playerNumber = playerNumber;
        this.setLabel("Player " + this.playerNumber + " has won the game!");
    }
}