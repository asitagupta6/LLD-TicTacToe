private boolean checkWinner(int row, int col, char symbol) {
    int size = board.getSize();
    Cell[][] grid = board.getGrid();

    boolean winRow = true, winCol = true, winDiag = true, winAntiDiag = true;

    for (int i = 0; i < size; i++) {
        if (grid[row][i].getSymbol() != symbol) winRow = false;
        if (grid[i][col].getSymbol() != symbol) winCol = false;
        if (grid[i][i].getSymbol() != symbol) winDiag = false;
        if (grid[i][size - i - 1].getSymbol() != symbol) winAntiDiag = false;
    }

    return winRow || winCol || winDiag || winAntiDiag;
}