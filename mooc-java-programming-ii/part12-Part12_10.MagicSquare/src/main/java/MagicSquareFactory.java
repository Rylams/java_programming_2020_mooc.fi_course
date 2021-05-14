
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        
        int currentRow = 0;
        int currentCol = size / 2;
        square.placeValue(currentCol, currentRow, 1);
        
        for (int number = 2; number <= size * size; number++) {
            int nextRow = currentRow - 1;
            int nextCol = currentCol + 1;
            
            if (nextRow < 0) {
                nextRow = size - 1;
            }
            if (nextCol > size - 1) {
                nextCol = 0;
            }
            if (square.readValue(nextCol, nextRow) != 0) {
                nextRow = currentRow + 1;
                nextCol = currentCol;
            }
            square.placeValue(nextCol, nextRow, number);
            currentRow = nextRow;
            currentCol = nextCol;
        }
        return square;
    }
}
