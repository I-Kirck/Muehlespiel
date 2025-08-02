public class Main {
    public static void main (String[] args){

        GameBoard gameBoard = new GameBoard();
        gameBoard.initBoard();

        for (char[] line: gameBoard.board){
            System.out.println(new String(line));
        }

    }
}

