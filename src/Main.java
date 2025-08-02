public class Main {
    public static void main (String[] args){

        GameBoard gameBoard = new GameBoard();
        char[][] board = gameBoard.boardTemplate;

        for (char[] line: board){
            System.out.println(new String(line));
        }

    }
}



