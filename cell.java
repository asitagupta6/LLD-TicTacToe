class Cell {
    private int row;
    private int col;
    private char symbol; // 'X', 'O', or EMPTY

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.symbol = '-';
    }

    public boolean isEmpty() {
        return symbol == '-';
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}