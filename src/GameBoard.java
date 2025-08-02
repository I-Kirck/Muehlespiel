public class GameBoard {

    int boardSize = 13;

    String[] stringBoardTemplate = {
            "•-----------•-----------•",
            "|           |           |",
            "|   •-------•-------•   |",
            "|   |       |       |   |",
            "|   |   •---•---•   |   |",
            "|   |   |       |   |   |",
            "•---•---•       •---•---•",
            "|   |   |       |   |   |",
            "|   |   •---•---•   |   |",
            "|   |       |       |   |",
            "|   •-------•-------•   |",
            "|           |           |",
            "•-----------•-----------•"
    };

    char[][] boardTemplate = new char[boardSize][boardSize];

    char[][] board = new char[boardSize][boardSize];

    public void initBoard(){
        for (int i = 0; i < boardSize; i++){
            boardTemplate[i] = stringBoardTemplate[i].toCharArray();
            board[i] = stringBoardTemplate[i].toCharArray();
        }
    }

}
