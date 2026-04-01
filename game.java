class Game {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;
    private GameStatus status;
    private Player winner;

    public Game(int size, Player p1, Player p2) {
        board = new Board(size);
        players = new Player[]{p1, p2};
        currentPlayerIndex = 0;
        status = GameStatus.IN_PROGRESS;
    }

    public boolean makeMove(int row, int col) {
        Player currentPlayer = players[currentPlayerIndex];

        boolean success = board.makeMove(row, col, currentPlayer.getSymbol());
        if (!success) return false;

        if (checkWinner(row, col, currentPlayer.getSymbol())) {
            status = GameStatus.WIN;
            winner = currentPlayer;
        } else if (isBoardFull()) {
            status = GameStatus.DRAW;
        } else {
            currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
        }

        return true;
    }