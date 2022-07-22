import java.util.Random;

public class MatrixLab {

    private int numRow;
    private int numColumn;
    private int[][] mx;

    public MatrixLab(int _row, int _column) {
        numRow = _row;
        numColumn = _column;
        mx = new int[_row][_column];
        Random random = new Random();

        for (int i = 0; i < _row; i++) {
            for (int j = 0; j < _column; j++) {
                mx[i][j] = random.nextInt(500);
            }
        }
    }

    public int sumRow(int row_Num) {
        int sum = 0;
        if(row_Num < numRow) {
            for (int i = 0; i < numColumn; i++) {
                sum = sum + mx[row_Num][i];
                if (i == numColumn - 1) {
                    System.out.println(sum);
                }
            }
        }
        else if(row_Num == numRow) {
            for (int i = 0; i < numColumn; i++) {
                sum = sum + mx[row_Num - 1][i];
                if (i == numColumn - 1) {
                    System.out.println("Result: " +sum);
                }
            }
        }else {
            System.out.println("Out ouf bound");
        }
        return sum;
    }

    public int sumCol(int col_Num) {
        int sum = 0;
        if(col_Num < numColumn) {
            for (int i = 0; i < numRow; i++) {
                sum = sum + mx[i][col_Num];
                if (i == numRow - 1) {
                    System.out.println(sum);
                }
            }
        }else if(col_Num == numColumn) {
            for (int i = 0; i < numRow; i++) {
                sum = sum + mx[i][col_Num - 1];
                if (i == numRow - 1) {
                    System.out.println("Result: " + sum);
                }
            }
        }else {
            System.out.println("Out ouf bound");
        }
        return sum;
    }

    public void print() {
        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numColumn; j++) {
                System.out.print(mx[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


}
