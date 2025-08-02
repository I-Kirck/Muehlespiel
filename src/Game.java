import java.util.Scanner;

public class Game {
    char[][] board;
    GameBoard gameBoard;

    Player currentPlayer = Player.PLAYER1;
    Boolean gameOver = false;
    int turnCount = 1;

    public Game(){
        gameBoard = new GameBoard();
        board = gameBoard.boardTemplate;
    }

    public void drawBoard(){
        for (char[] line: board){
            System.out.println(new String(line));
        }
    }

    public void processInput(String point){
        GameBoard.Point coords = gameBoard.coordMap.get(point);
        board[coords.row][coords.col] = currentPlayer.getSymbol();
        currentPlayer = currentPlayer.getOpponent();
    }

    public String waitForInput(){
        Scanner userInput = new Scanner(System.in);
        while (true) {
            String string = String.format("%s setze einen Stein (Auswahl über Zahlenkombo, z.B. 71 -> 7. Spalte, 1. Reihe):", currentPlayer.getName());
            System.out.println(string);

            String input = userInput.nextLine();

            if (!input.isEmpty()) {
                return input;
            }
        }
    }

    public void checkForGameOver(){
        if (turnCount == 3){
            gameOver = true;
        } else {
            turnCount++;
        }
    }


    public void gameLoop() {
        while (true) {
            String input = waitForInput();
            processInput(input);
            drawBoard();
            checkForGameOver();

            if (gameOver){
                return;
            }
        }
    }

}
