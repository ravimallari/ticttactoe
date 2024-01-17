package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import models.SpecificPlayer.PlayerType;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Player {
    private String name;
    private int id;
    private char symbol;
    private int rank;
    private PlayerType playerType;
}
