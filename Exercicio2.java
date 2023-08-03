/*2)	Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares. */


package ForWhileDo;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int contPares=0,contImpares=0;
		
		for (int i=0; i<10; i++) {
			System.out.printf("\nDigite o %d° Número",i+1);
			int x =sc.nextInt();
			if(x%2==0) {
				contPares++;
			}else if(x%2==1) {
				contImpares++;
			}
		}
		System.out.println("Total de números pares: "+contPares);
		System.out.println("Total de números ímpares: "+contImpares);

		
		
		
		sc.close();
	}
}
