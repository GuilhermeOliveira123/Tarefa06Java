package exercicio06tarefaflamingo;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*04)Ler quatro valores referentes a quatro notas escolares de um aluno e 
		imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da m�dia 
		escolar for maior ou igual a 5. Se o valor da m�dia for menor que 7, solicitar a nota de exame, 
		somar com o valor da m�dia e obter nova m�dia. Se a nova m�dia for maior ou igual a 5, 
		apresentar uma mensagem dizendo que o aluno foi aprovado em exame. Se o aluno n�o foi aprovado, 
		indicar uma mensagem informando esta condi��o. Apresentar com as mensagens o valor da m�dia do aluno, 
		para qualquer condi��o.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Primeira Nota: ");
		int primeiraNota = sc.nextInt();
		System.out.println("Digite a Segunda Nota: ");
		int segundaNota = sc.nextInt();
		System.out.println("Digite a terceira Nota: ");
		int terceiraNota = sc.nextInt();
		System.out.println("Digite a quarta Nota: ");
		int quartaNota = sc.nextInt();
		int mediaNota = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		if (mediaNota >= 7) {
			System.out.println("Aluno Aprovado M�dia: " + mediaNota);
		} else {
			System.out.println("Digite a Nota da Prova de Recupera��o: ");
			int quintaNota = sc.nextInt();
			int novaMedia = mediaNota + quintaNota / 2;
			if (novaMedia >= 5) {
				System.out.println("Aluno Aprovado com a M�dia: " + novaMedia);
			} else {
				System.out.println("Aluno Reprovado Com a M�dia: " + novaMedia);
			}
			sc.close();
		}

	}

}
