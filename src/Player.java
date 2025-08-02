
public enum Player {
    PLAYER1('X', "Spieler 1"),
    PLAYER2('O', "Spieler 2");
    private final char symbol;
    private final String name;

    Player(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public Player getOpponent() {
        return this == PLAYER1 ? PLAYER2 : PLAYER1;
    }
}
