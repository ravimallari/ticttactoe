import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.GameController;
import controller.PlayerController;
import models.Player;
import models.SpecificPlayer.DifficultyLevel;
import models.strategies.WinningStrategies.ColWinningStrategy;
import models.strategies.WinningStrategies.RowWinningStrategy;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to game");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the dimension of the game");

        int dimension = sc.nextInt();

        System.out.println("How many players");

        int n = sc.nextInt();

        List<Player> players = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Please enter details of the player " + (i + 1));
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Symbol: ");
            String symbol = sc.next();
            System.out.println("Is this the player Bot: Y/N");
            if(sc.next().equals("Y"))
            {
                System.out.println("What's the level of the Bot player");
                var botLevel = sc.next();
                DifficultyLevel difficultyLevel = DifficultyLevel.EASY;
                switch(botLevel){
                    case "E":
                        difficultyLevel = DifficultyLevel.EASY;
                        break;
                    case "M":
                        difficultyLevel = DifficultyLevel.MEDIUM;
                        break;
                    case "H":
                        difficultyLevel = DifficultyLevel.HARD;
                        break;
                }

                players.add(PlayerController.createBotPlayer(name, difficultyLevel, symbol.charAt(0)));
            }
            else{
                players.add(PlayerController.createHumanPlayer(name, symbol.charAt(0)));
            }
        }

        var game = GameController.initialGame(dimension, players, List.of(new ColWinningStrategy(), new RowWinningStrategy()));
        System.out.println("Do you want to start");

        if(sc.next().equals("Y"))
        {
            new GameController(game).startGame();
            System.out.println("Game ended");
        }

        sc.close();
    }
}
