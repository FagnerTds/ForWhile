/*1)	Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e precisam de um sistema 
 * 	para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:
●	Idade (Número inteiro)
●	Sexo (Número Inteiro): 
o	1 – Masculino
o	2 – Feminino
o	3 – Outros
●	Categoria (Número Inteiro):
o	1 – Backend
o	2 – Frontend
o	3 – Mobile
o	4 – FullStack
Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados de um novo 
colaboradore ou não (S/N). Caso seja pressionada a tecla N, mostre na tela:

●	O número de pessoas desenvolvedoras Backend
●	O número de mulheres desenvolvedoras Frontend
●	O número de homens desenvolvedores Mobile maiores de 40 anos
●	O número de mulheres desenvolvedoras FullStack menores de 30 anos*/

package ForWhileDo;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int contB=0,contF=0,contM=0,contFs=0, idade, sexo, categ;
		
		while(true) {
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
			
			System.out.println("Digite o número do sexo: ");
			sexo = sc.nextInt();
			
			System.out.println("Digite a categoria: ");
			categ = sc.nextInt();
			
			if((sexo==1 && categ==1) || sexo==3 && categ==1) {
				contB++;
			}else if(sexo==1 && categ==3 && idade>40) {
				contM++;
			}if (sexo==2 && categ==1) {
				contB++;
			}else if(sexo==2 && categ==2) {
				contF++;
			}else if(sexo==2 && categ==4 && idade<30) {
				contFs++;
			}System.out.println("Deseja continuar (S/N):  ");
			sc.nextLine();
			String cont = sc.nextLine();
			if (cont.equalsIgnoreCase("n")) {
				break;
			}
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "+contB);
		System.out.println("Total de mulheres desenvolvedoras Frontend: "+contF);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: "+contM);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: "+contFs);


		
		
	
		sc.close();
	}

}
