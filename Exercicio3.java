/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas
 *cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. 
 *A leitura dos dados deve ser finalizada ao digitar uma idade negativa*/
 
package ForWhileDo;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma idade");
		int idade=sc.nextInt(),cont21=0,cont50=0;
		
		while(idade>0) {
			if(idade<21) {
				cont21++;
			}else if(idade>50) {
				cont50++;
			}
			System.out.println("Digite uma idade");
			idade=sc.nextInt();	
		}
		System.out.println("Total de pessoas menores de 21 anos: "+cont21);
		System.out.println("Total de pessoas maioreas de 50 anos: "+cont50);

		sc.close();
	}

}
