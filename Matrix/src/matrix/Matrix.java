
package matrix;

import java.util.Scanner;


public class Matrix {
    int matriz1 [][];
    int matriz2 [][];
    
    public void start(int col1, int row1, int col2, int row2){
        matriz1 = new int [col1][row1];
        matriz2 = new int [col2][row2];
    }
    
    Scanner entrada = new Scanner(System.in);
    
    public void addOne(int col1, int row1, int number){
        for (int col = 0; col < col1; col++) {
            for (int row = 0; row < row1; row++) {
                System.out.printf("Digite um valor para a matriz 1, na posição [%d][%d]: ", col + 1, row + 1);
		matriz1[col][row] = entrada.nextInt();
            }
        }
    }
    
    public void addTwo(int col2, int row2, int number){
        for (int col = 0; col < col2; col++) {
            for (int row = 0; row < row2; row++) {
                System.out.printf("Digite um valor para a matriz 2, na posição [%d][%d]: ", col + 1, row + 1);
		matriz2[col][row] = entrada.nextInt();
            }
        }
    }
    
    public void see1(int col1, int row1){
        System.out.println("***Matriz 1***");
        for(int col = 0; col < col1; col++) {
            for(int row = 0; row < row1; row++) {
                System.out.print(matriz1[col][row] + " ");
            }	
            System.out.println(" ");
        }
    }
    
    public void see2(int col2, int row2){
        System.out.println("***Matriz 2***");
        for(int col = 0; col < col2; col++) {
            for(int row = 0; row < row2; row++) {
                System.out.print(matriz2[col][row] + " ");
            }	
            System.out.println(" ");
        }
    }
    
    public void principalDiagonalOne(int col1, int row1){
        if(col1 == row1){
            System.out.println("***Diagonal principal da Matriz 1***");
            for (int row = 0; row < row1; row++) {
		for (int col = 0; col < col1; col++) {
                    if (row == col) {
			System.out.print(" " + matriz1[col][row]);
                    }
		}
            }
            System.out.println(" ");
        } else {
            System.out.println("O número de linhas e colunas da matriz não é igual. impossivel achar a diagonal principal!");
        }
    }
    
    public void principalDiagonalTwo(int col2, int row2){
        if(col2 == row2){
            System.out.println("***Diagonal principal da Matriz 1***");
            for (int col = 0; col < row2; col++) {
		for (int row  = 0; row  < col2; row ++) {
                    if (row == col) {
			System.out.print(" " + matriz2[col][row]);
                    }
		}
            }
            System.out.println(" ");
        } else {
            System.out.println("O número de linhas e colunas da matriz não é igual. impossivel achar a diagonal principal!");
        }
    }
    
    public void secondaryDiagonalOne(int col1, int row1){
        if(col1 == row1){
            row1 = row1 - 1;
            System.out.println("***Diagonal secundaria da Matriz 1***");
            for (int col = 0; col < col1; col++) {
                System.out.print(" " + matriz2[col][row1--]);
            }
            System.out.println(" ");
        } else {
            System.out.println("O número de linhas e colunas da matriz não é igual. impossivel achar a diagonal secundaria!");
        }
    }
    
    public void secondaryDiagonalTwo(int col2, int row2){
        if(col2 == row2){
            row2 = row2 - 1;
            System.out.println("***Diagonal secundaria da Matriz 1***");
            for (int col = 0; col < col2; col++) {
                System.out.print(" " + matriz2[col][row2--]);
            }
            System.out.println(" ");
        } else {
            System.out.println("O número de linhas e colunas da matriz não é igual. impossivel achar a diagonal secundaria!");
        }
    }
}
