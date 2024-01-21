package controller;

import models.Player;
import models.SpecificPlayer.BotPlayer;
import models.SpecificPlayer.DifficultyLevel;
import models.SpecificPlayer.HumanPlayer;
import models.SpecificPlayer.PlayerType;

public class PlayerController {
    public static Player createHumanPlayer(String name, char symbol){
        var player = HumanPlayer.builder().age(12).build();
        player.setName(name);
        player.setSymbol(symbol);
        player.setPlayerType(PlayerType.HUMAN);
        return player;
    }   
    
    public static Player createBotPlayer(String name, DifficultyLevel difficultyLevel, char symbol){
        var player = BotPlayer.builder().difficultyLevel(difficultyLevel).build();
        player.setName(name);
        player.setSymbol(symbol);
        player.setPlayerType(PlayerType.BOT);
        return player;
    }
}
