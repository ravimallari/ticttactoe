package models.strategies.WinningStrategies;

import models.Board;
import models.Cell;

public interface WinningStrategy {
    boolean checkWin(Cell cell, Board board);
}
