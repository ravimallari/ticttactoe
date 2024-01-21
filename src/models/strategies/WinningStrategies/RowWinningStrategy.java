package models.strategies.WinningStrategies;

import models.Board;
import models.Cell;

public class RowWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWin(Cell cell, Board board) {
        char currentPlayerSymbol = cell.getPlayer().getSymbol();

        int row = cell.getRow();

        for(int i = 0; i < board.getSize(); i++){
            var currentCell = board.getBoard().get(row).get(i);
            if(!currentCell.isOccupied() || currentCell.getPlayer().getSymbol() != currentPlayerSymbol)
                return false;
        }

        return true;
    }
    
}
