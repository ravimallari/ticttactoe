package services;

import models.Board;
import models.Game;
import models.GameState;
import models.Player;

public class GameService {

    private Game game;

    public GameService(Game game) {
        this.game = game;
    }

    public void executeTheNextMoves(){
        var board = this.game.getBoard();
        while (checkEmptySpaces(board)) {
            Player currentPlayer = game.getPlayers().get(game.getNextPlayerIndex());
            System.out.println("It's the move of " + currentPlayer.getName());
            var movedCell = currentPlayer.nextMove(board);
            game.getBoard().toString();

            for(int i = 0; i < this.game.getWinningStrategies().size(); i++){
                if(this.game.getWinningStrategies().get(i).checkWin(movedCell, board)){
                    game.setGameState(GameState.SUCCESS);
                    System.out.println("Game is over and the player won is " + movedCell.getPlayer().getName());
                    break;
                }
            }

            game.setNextPlayerIndex((game.getNextPlayerIndex() + 1) % game.getPlayers().size());
        }
    }

    private boolean checkEmptySpaces(Board board){
        for(int i = 0; i< board.getSize(); i++){
            for (int j = 0; j < board.getSize(); j++){
                if(board.getBoard().get(i).get(j).isOccupied())
                    return false;
            }
        }

        return true;
    }
}
