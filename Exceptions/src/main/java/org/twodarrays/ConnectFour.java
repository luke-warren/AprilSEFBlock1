package org.twodarrays;

public class ConnectFour {

    private static final int ROWS = 6;
    private static final int COLS = 7;
    private String[][] board = new String[ROWS][COLS];
    private static String [][] exampleBoard =
                   {{"", "", "", "", "", "", ""},
                    {"", "", "", "", "", "", ""},
                    {"", "", "R", "", "", "", ""},
                    {"", "", "R", "Y", "", "", ""},
                    {"", "", "R", "R", "Y", "", ""},
                    {"", "", "R", "R", "Y", "Y", ""}};
    //place piece()
    public boolean placePiece(String[][] gameBoard, int row, int col, String piece){
        try{
            String coordinate = gameBoard[row][col];
            if(coordinate.isEmpty()){
                if(row == ROWS-1 || !(gameBoard[row+1][col].isEmpty())) {
                    gameBoard[row][col] = piece;
                    return true;
                }
            }
            return false;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("You tried to place a piece outside the board");
            System.out.println(e.getMessage());
            return false;
        }
        catch (Exception e){
            System.out.println("Unexpected error" + e.getMessage());
            return false;
        }
    }
    public static boolean checkVertical(String[][] gameBoard) {
        for(int j = 0; j < COLS; j++){
            for (int i = 0; i <= ROWS-4; i++){
                String piece = gameBoard[i][j];
                if(!piece.isEmpty()) {
                    String pieceTwo = gameBoard[i + 1][j];
                    String pieceThree = gameBoard[i + 2][j];
                    String pieceFour = gameBoard[i + 3][j];
                    if (piece.equals(pieceTwo) && piece.equals(pieceThree) && piece.equals(pieceFour)) {
                        System.out.println(piece);
                        System.out.println(piece + " team is the winner!!");
                        return true;

                    }
                }
            }
        }
        return false;
    }
    public static void checkLeftToRightDiagonal(String[][] gameBoard){
        for(int i = 0; i < gameBoard.length-4; i++){
           for(int j=0; j < gameBoard[i].length-4; j++){
               if(!gameBoard[i][j].isEmpty() && gameBoard[i][j].equals(gameBoard[i+1][j+1]) &&
                       gameBoard[i][j].equals(gameBoard[i+2][j+2]) &&
                       gameBoard[i][j].equals(gameBoard[i+3][j+3]))
               {
                   System.out.println(gameBoard[i][j] + " is the winner!");
                   return;
               }
           }
        }
        System.out.println("No winner yet.");
    }

    public static void main(String[] args){
        try {
            checkVertical(exampleBoard);
            checkLeftToRightDiagonal(exampleBoard);
        }
        catch (Exception e){
            System.out.println("Hello");
        }
    }



    //Check winner()
    //checkHorizontal()
    //Check vertical()
    //Check diagonal
}
