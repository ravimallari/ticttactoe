package models;

public class Cell {
    private int row, col;
    private Player player;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void ToString(){
        char symbol = '_';
        if(this.player != null && this.player.getSymbol() != '\u0000')
            symbol = this.player.getSymbol();
        System.out.print(symbol);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
