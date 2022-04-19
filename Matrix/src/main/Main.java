
package main;

import java.util.Scanner;
import matrix.Matrix;

public class Main {
    public static void main(String[] args) {
        
        Matrix matriz = new Matrix();
        Scanner enter = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz 1: ");
	int col1 = enter.nextInt();
        int row1 = enter.nextInt();
        int total1 = col1 * row1;
        int number = 0;
        
        System.out.print("Digite o tamanho da matriz 2: ");
	
	int col2 = enter.nextInt();
        int row2 = enter.nextInt();
        int total2 = col2 * row2;
        
        matriz.start(col1, row1, col2, row2);
        
        for (int col = 0; col < col1; col++) {
            for (int row = 0; row < row1; row++) {
                System.out.println("Digite o numero: ");
                number = enter.nextInt();
                matriz.addOne(col1, row1, number);
            }
        }
        
        
        
        matriz.see1(col1, row1);
        
    }
}
