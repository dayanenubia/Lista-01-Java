
package operations;

import java.util.ArrayList;
import java.util.List;

public class Operations {

    List<Integer> list = new ArrayList();
	
	public void addList(int amount, int number) {
            list.add(number);
	}
	
	public double arithmeticList(int amount) {
            int aux;
            int soma = 0;
            double resultado;
            for(int a = 0; a < amount; a++) {
		aux = list.get(a);
		soma = soma + aux;
            }
            resultado = soma / amount;
            return resultado;
	}
        
        public double geometricList(int amount){
            int soma = 1;
            int aux;
            double resultado = 0;
            for(int cont = 0; cont < amount; cont++){
                aux = list.get(cont);
                soma = soma * aux;
                resultado = Math.sqrt(soma);
            }
            return resultado;
        }
        
        public void evenOrOdd(int amount){
            for(int cont = 0; cont < amount; cont++){
                if(list.get(cont) % 2 == 0){
                    System.out.println("Par: " + list.get(cont));
                } else {
                    System.out.println("Impar: " + list.get(cont));
                }
            }
        }
    
}
