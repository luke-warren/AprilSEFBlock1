package org.magicsquare;

public class MagicSquare {

    public static void main(String [] args){
        try{
                                    // new int[3][3];
            int[][] magicSquare = {{2, 7, 6},
                                   {9, 5, 1},
                                   {4, 3, 8}};
            int rowTotal = 0;
            for(int row = 0; row < magicSquare.length; row++){
                for(int col = 0; col < magicSquare[row].length; col++){
                    System.out.println("current element: " + magicSquare[row][col]);
                    rowTotal += magicSquare[row][col];
                }
                System.out.println(rowTotal);
                rowTotal = 0;
            }


        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
