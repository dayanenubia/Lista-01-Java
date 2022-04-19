
package matrix;


public class Matrix {
    int matrix1 [][];
    int matrix2 [][];
    
    public void start(int col1, int row1, int col2, int row2){
        matrix1 = new int [col1][row1];
        matrix2 = new int [col2][row2];
    }
    
    public void addOne(int col1, int row1, int number){
        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col1; col++) {
                matrix1[col][row] = number;
            }
        }
    }
    
    public void addTwo(int col2, int row2, int number){
        for (int row = 0; row < row2; row++) {
            for (int col = 0; col < col2; col++) {
                matrix1[row][col] = number;
                System.out.println(matrix1[row][col] + " ");
            }
        }
    }
    
    public void see1(int col1, int row1){
        for(int row = 0; row < row1; row++) {
            for(int col = 0; col < col1; col++) {
                System.out.print(matrix1[row][col] + " ");
            }	
            System.out.println(" ");
        }
    }
}
