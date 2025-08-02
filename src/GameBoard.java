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

    //Koordinanten auf die man setzten kann
    String[] validPoints = {
            "11", "41", "71",
            "22", "42", "62",
            "33", "43", "53",
            "14", "24", "34", "54", "64", "74",
            "35", "45", "55",
            "26", "46", "66",
            "17", "47", "77"
    };

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

    //SpielfeldKoordinaten 7x7
    public void mapPointsToCoords(){
        int index = 0;
        for (int row = 0; row < boardTemplate.length; row++){
            for (int col = 0; col < boardTemplate[row].length; col++){
                if(boardTemplate[row][col] == '•'){
                    String key = validPoints[index];
                    coordMap.put(key, new Point(row, col));
                    index++;
                }
            }
        }
    }

}


