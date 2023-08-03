/*5)	Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
 * Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.*/

package ForWhileDo;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
	System.out.println("Digite um número: ");
	int numero=sc.nextInt(),soma=0;
	
	do {
		if(numero>0) {
		soma+=numero;
		}
		System.out.println("Digite um número: ");
		numero=sc.nextInt();
		
	}while(numero!=0);
		System.out.println("A soma dos Números positivos é: "+soma);
		
		sc.close();
	}

}
