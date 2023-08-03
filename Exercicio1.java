/*1)	Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.*/


package ForWhileDo;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um número");
		int n1=sc.nextInt();
		System.out.println("Digite um número maior que o anterior");
		int n2=sc.nextInt();
		
		
		if(n1<n2) {	
			System.out.printf("No intervalo entre %d e %d :",n1,n2,"\n");
			for(int i=n1; i<=n2; i++) {
				if(i%3==0 && i%5==0) {
					System.out.printf("\n%d é multiplo de 3 e 5 ",i);
				}
			}
		}else {
			System.out.println("intervalo inválido");
		}
			
		
		sc.close();
	}

}
