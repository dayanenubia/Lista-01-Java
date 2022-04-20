
package main;

import java.util.Scanner;
import matrix.Matrix;

public class Main {
    public static void main(String[] args) {
        
        Matrix matriz = new Matrix();
        
        Scanner enter = new Scanner(System.in);

        System.out.println("**Digite o tamanho da matriz 1**");
        System.out.print("Coluna: ");
	int col1 = enter.nextInt();
        System.out.print("Linha: ");
        int row1 = enter.nextInt();
        
        
        System.out.println("**Digite o tamanho da matriz 2**");
	System.out.print("Coluna: ");
	int col2 = enter.nextInt();
        System.out.print("Linha: ");
        int row2 = enter.nextInt();

        matriz.start(col1, row1, col2, row2);
        
        matriz.addOne(col1, row1, row2);
        
        matriz.addTwo(col2, row2, row2);
        
        System.out.println("*** Escolha a opção  ***");
	System.out.println("1 - Ver as matrizes");
	System.out.println("2 - Ver a diagonal principal das matrizes");
	System.out.println("3 - Ver a diagonal secundaria das matrizes");
	System.out.println("4 - Sair\n");
        
	int option = enter.nextInt();

        while (true) {
            switch (option) {
                case 1: {
                    matriz.see1(col1, row1);
                    matriz.see2(col2, row2);
		}
		break;
                case 2: {
                    matriz.principalDiagonalOne(col1, row1);
                    matriz.principalDiagonalTwo(col2, row2);  		
		}
		break;
                case 3: {
                    matriz.secondaryDiagonalOne(col1, row1);
                    matriz.secondaryDiagonalTwo(col2, row2);
		}
		break;
                case 4: {
                    System.out.println("Saindo...\n");
                    return;
                }
                default:
                    System.out.println("Opção inválida!\n");  
            }
            System.out.println("*** Escolha a opção  ***");
            System.out.println("1 - Ver as matrizes");
	    System.out.println("2 - Ver a diagonal principal das matrizes");
            System.out.println("3 - Ver a diagonal secundaria das matrizes");
            System.out.println("4 - Sair\n");
        
            option = enter.nextInt();
        }
        
    }
}
