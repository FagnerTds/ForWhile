/*6)	Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
 * Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3.*/

package ForWhileDo;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero=sc.nextInt(),cont=0;
		double media,soma=0;
		
		do {
			if(numero%3==0) {
			soma+=numero;
			cont++;
			}
			System.out.println("Digite um número: ");
			numero=sc.nextInt();
			
		}while(numero!=0);
		
		media=soma/cont;
		
		System.out.println("A média de todos os números múltiplos de 3 é: "+media);
			
			sc.close();
	}

}
