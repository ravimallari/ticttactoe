import java.util.List;

import models.Game;
import models.Player;
import models.SpecificPlayer.HumanPlayer;

public class App {
    public static void main(String[] args) throws Exception {
        Player human = new HumanPlayer();
        Game game = new Game(3, List.of(human), null);
        game.getBoard().ToString();
    }
}
