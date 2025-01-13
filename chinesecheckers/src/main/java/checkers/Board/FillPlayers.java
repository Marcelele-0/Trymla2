package checkers.Board;

import java.util.ArrayList;
import java.util.List;

import checkers.Cell.Cell;
import checkers.Cell.CellStatus;
import checkers.Cell.HomeCell;
import checkers.Player.Player;
import checkers.Player.PlayerCells;

public class FillPlayers {
    public PlayerCells FillPlayerCells(Board board, Player player) {
        List<Cell> homeCells = new ArrayList<>();
        List<Cell> currentCells = new ArrayList<>();

        for (int row = 0; row < board.getRows(); row++) {
            for (int column = 0; column < board.getColumns(); column++) {
                Cell cell = board.getCell(row, column);
                if (cell.getStatus() == CellStatus.ILLEGAL) {
                    continue; // Skip illegal cells
                }
                if (cell instanceof HomeCell && ((HomeCell) cell).getHomeColor() == player.getColor()) {
                    cell.setStatus(CellStatus.OCCUPIED);
                    cell.setPlayerNumber(player.getNumber());
                    homeCells.add(cell);
                    cell.setColor(((HomeCell) cell).getHomeColor());
                }
                if (cell.isOccupiedByPlayer(player.getNumber())) {
                    currentCells.add(cell);
                }
            }
        }

        return new PlayerCells(homeCells, currentCells);
    }
}


