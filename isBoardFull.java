private boolean isBoardFull() {
    for (Cell[] row : board.getGrid()) {
        for (Cell cell : row) {
            if (cell.isEmpty()) return false;
        }
    }
    return true;
}