package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;
    
    public Board(int dimension) {
        this.size = dimension;
        this.board = new ArrayList<>();
        createBoard();
    }

    private void createBoard(){
        for(int i = 0; i < this.size; i++){
            var arrayList = new ArrayList<Cell>();
            for(int j = 0; j < this.size; j++){
                arrayList.add(new Cell(i, j));
            }
            board.add(arrayList);
        }
    }

    public void ToString(){
        for(int i = 0; i< this.size; i++)
        {
            for(int j = 0; j < this.size; j++){
                board.get(i).get(j).ToString();
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
