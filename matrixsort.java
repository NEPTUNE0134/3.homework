package ödev1;

import java.util.Random;

public class matrixsort {

	public static int[][] matrixfull(int row, int column) {
        int[][] matrix = new int[row][column];
        Random rnd = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = rnd.nextInt(100); 
            }
        }
        return matrix;
    }

    
    public static void matrixsort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] < matrix[k][l]) {
                            
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }
    }

    public static void Printmatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int[][] matrix = matrixfull(5, 5);

        
        System.out.println("Original Matrix:");
        Printmatrix(matrix);

        matrixsort(matrix);

        
        System.out.println("sequential matrix:");
        Printmatrix (matrix);
    }
}
