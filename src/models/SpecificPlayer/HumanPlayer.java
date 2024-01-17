package models.SpecificPlayer;

import models.Player;

public class HumanPlayer extends Player {
    private int age;
    private int rank;

    public HumanPlayer() {
        this.setPlayerType(PlayerType.HUMAN);
    }
}
