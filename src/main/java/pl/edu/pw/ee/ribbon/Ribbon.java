package pl.edu.pw.ee.ribbon;

import java.util.Arrays;

public class Ribbon {
    private final int[] pieces;
    private final int totalLength;

    public Ribbon(int totalLength){
        if (totalLength < 1){
            throw new IllegalArgumentException("Total length is out of range!!!");
        }

        this.totalLength = totalLength;
        this.pieces = new int[3];
    }

    public void setPieces(int index, int piece){
        if (piece < 1 || piece > 4000){
            throw new IllegalArgumentException("Arguments are out of range!!");
        }
        if (index < 0 || index > 3){
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds!!");
        }

        this.pieces[index] = piece;
    }

    public int getTotalLength(){
        return totalLength;
    }

    public int getPiece(int index){
        return pieces[index];
    }

    public int countMaxNumber(){
        int maxNumber = 0;

        for (int i = 0; i < 3; i++){
            int size = 0;
            int number = 0;

            for (int j = i; j < 3; j++){
                int newSize = size + pieces[j];

                if (newSize <= totalLength){
                    number++;
                    size = newSize;
                }
            }
            maxNumber = Math.max(number, maxNumber);
        }

        return maxNumber;
    }

    @Override
    public String toString(){
        return "Total length: " + totalLength + "\nPieces: " + Arrays.toString(pieces);
    }
}
