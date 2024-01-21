package models.SpecificPlayer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.experimental.SuperBuilder;
import models.Board;
import models.Cell;
import models.Player;
import models.strategies.MovingStrategies.EasyBotPlayingStrategies;
import models.strategies.MovingStrategies.MovingStrategies;

@Builder
@AllArgsConstructor
public class BotPlayer extends Player {
    private DifficultyLevel difficultyLevel;
    private MovingStrategies movingStrategies = new EasyBotPlayingStrategies();

    public BotPlayer() {
        this.setPlayerType(PlayerType.BOT);
    }

    @Override
    public Cell nextMove(Board board) {
        var cell = movingStrategies.suggestMove(board);
        if(cell != null)
            cell.setPlayer(this);

        return cell;
    }
}
