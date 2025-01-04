package checkers.Game;

import java.util.ArrayList;

import checkers.Board.Board;
import checkers.Player.Player;

public class Game {
    
    private int playerCount;
    //private int botCount;
    private Board board;
    private ArrayList <Player> players; 

    public Game(ArrayList <Player> players) {
        this.players = players;
        this.playerCount = players.size();
        this.board = new Board(playerCount);
    }
    
    public Board getBoard() {
        return board;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
    
    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
    
}
