import java.util.Map;
import java.util.HashMap;

public class GameBoard {

    int boardSize = 14;

    String[] stringBoardTemplate = {
            "  1   2   3   4   5   6   7",
            "1 •-----------•-----------•",
            "  |           |           |",
            "2 |   •-------•-------•   |",
            "  |   |       |       |   |",
            "3 |   |   •---•---•   |   |",
            "  |   |   |       |   |   |",
            "4 •---•---•       •---•---•",
            "  |   |   |       |   |   |",
            "5 |   |   •---•---•   |   |",
            "  |   |       |       |   |",
            "6 |   •-------•-------•   |",
            "  |           |           |",
            "7 •-----------•-----------•"
    };

    char[][] boardTemplate = new char[boardSize][boardSize];

    //Setzbare Punkte
    static class Point {
        int row, col;
        Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    Map<String, Point> coordMap = new HashMap<>();


    public GameBoard(){
        initBoard();
        mapPointsToCoords();
    }

    public void initBoard(){
        for (int i = 0; i < boardSize; i++){
            boardTemplate[i] = stringBoardTemplate[i].toCharArray();
        }
    }

    public void mapPointsToCoords(){
        int gameY = 1;
        for (int row = 0; row < boardTemplate.length; row++){
            //SpielfeldKoordinate 7x7
            int gameX = 1;
            boolean foundPoint = false;
            for (int col = 0; col < boardTemplate[row].length; col++){

                if(boardTemplate[row][col] == '•'){

                    String key = String.format("%d%d", gameY, gameX);
                    coordMap.put(key, new Point(row, col));

                    gameX++;
                    foundPoint = true;
                }
            }

            if (foundPoint){
                gameY++;
            }
        }
    }

}


