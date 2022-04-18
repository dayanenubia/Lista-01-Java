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
		
		System.out.print("A media aritimetica é: " + operation.arithmeticList(amount));
		
	}
}
