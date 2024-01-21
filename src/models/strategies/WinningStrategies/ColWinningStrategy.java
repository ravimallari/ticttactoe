package models.strategies.WinningStrategies;

import models.Board;
import models.Cell;

public class ColWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWin(Cell cell, Board board) {
        char currentPlayerSymbol = cell.getPlayer().getSymbol();

        int col = cell.getCol();

        for(int i = 0; i < board.getSize(); i++){
            var currentCell = board.getBoard().get(i).get(col);
            if(!currentCell.isOccupied() || currentCell.getPlayer().getSymbol() != currentPlayerSymbol)
                return false;
        }

        return true;
    }
}
