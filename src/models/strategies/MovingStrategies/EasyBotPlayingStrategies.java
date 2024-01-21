package models.strategies.MovingStrategies;

import models.Board;
import models.Cell;

public class EasyBotPlayingStrategies implements MovingStrategies {

    @Override
    public Cell suggestMove(Board board) {
        int n = board.getSize();
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                var currentCell = board.getBoard().get(i).get(j);
                if(!currentCell.isOccupied())
                    return currentCell;;
            }
        }

        return null;
    }
    
}
