package models.SpecificPlayer;

import models.Player;

public class BotPlayer extends Player {
    private DifficultyLevel difficultyLevel;

    public BotPlayer() {
        this.setPlayerType(PlayerType.BOT);
    }
}
