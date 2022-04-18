package operations;

import java.util.ArrayList;
import java.util.List;

public class Operations {
	List<Integer> list = new ArrayList();
	
	public void addList(int amount, int number) {
		for(int aux = 0; aux < amount; aux++) {
			list.add(number);
		}	
	}
	
	public int arithmeticList(int amount) {
		int aux;
		int soma = 0;
		int resultado;
		for(int a = 0; a < amount; a++) {
			aux = this.list.get(a);
			soma = soma + aux;
		}
		resultado = soma / amount;
		return resultado;
	}

}
