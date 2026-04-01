class Board {
    private int size;
    private Cell[][] grid;

    public Board(int size) {
        this.size = size;
        grid = new Cell[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (grid[row][col].isEmpty()) {
            grid[row][col].setSymbol(symbol);
            return true;
        }
        return false;
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public int getSize() {
        return size;
    }
}