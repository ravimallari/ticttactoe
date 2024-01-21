package models.SpecificPlayer;

import java.util.Scanner;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import models.Board;
import models.Cell;
import models.Player;


@Builder
@AllArgsConstructor
public class HumanPlayer extends Player {
    private int age;
    private int rank;

    public HumanPlayer() {
        this.setPlayerType(PlayerType.HUMAN);
    }

    @Override
    public Cell nextMove(Board board) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the row");
        int row = sc.nextInt();
        System.out.println("enter the column");
        int col = sc.nextInt();

        if(board.getBoard().get(row).get(col).isOccupied())
         throw new IllegalArgumentException("cell is already occupied");
        
        var cell = board.getBoard().get(row).get(col);
        cell.setPlayer(this);

        return cell;
    }
}
