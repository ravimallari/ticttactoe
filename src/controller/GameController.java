package controller;

import java.util.List;

import models.Game;
import models.GameState;
import models.Player;
import models.strategies.WinningStrategies.WinningStrategy;
import services.GameService;

public class GameController {

    Game game;
    GameService _service;

    public GameController(Game _game){
        game = _game;
        _service = new GameService(_game);
    }

    public static Game initialGame(int dimension,
                     List<Player> players,
                     List<WinningStrategy> strategies)
    {
        return new Game(dimension, players, strategies);
    }

    public void startGame(){
        game.setGameState(GameState.INPROGRESS);
        _service.executeTheNextMoves();
    }
}