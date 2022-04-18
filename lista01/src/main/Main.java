
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import operations.Operations;

public class Main {
    public static void main(String[] args) {
		
	Operations operation = new Operations();	
	
	Scanner enter = new Scanner(System.in);
        
        System.out.print("Quantos numeros você quer adicionar na lista?: ");
	
	int amount = enter.nextInt();
		
	for(int cont = 0; cont < amount; cont++) {
            System.out.print("Digite o numero: ");
            int number = enter.nextInt();
            operation.addList(amount, number);
        }
        
        System.out.println("*** Escolha a opção  ***");
	System.out.println("1 - Média Aritimética");
	System.out.println("2 - Média Geométrica");
	System.out.println("3 - Pares e Ímpares");
	System.out.println("4 - Sair\n");
        
	int option = enter.nextInt();
	
        while (true) {
            switch (option) {
                case 1: {
                    System.out.println("A media aritimetica é: " + operation.arithmeticList(amount) + "\n");
		}
		break;
                case 2: {
                    System.out.println("A media geometrica é: " + operation.geometricList(amount) + "\n");		
		}
		break;
                case 3: {
                    operation.evenOrOdd(amount);	
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
            System.out.println("1 - Média Aritimética");
            System.out.println("2 - Média Geométrica");
            System.out.println("3 - Pares e Ímpares");
            System.out.println("4 - Sair\n");
        
            option = enter.nextInt();
        }
    }
}
