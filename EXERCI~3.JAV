package exercicio06tarefaflamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*03). Ler quatro valores referentes a quatro notas escolares de um aluno e 
		imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da m�dia escolar for 
		maior ou igual a 5. Se o aluno n�o foi aprovado, indicar uma mensagem informando esta condi��o. 
		Apresentar junto das mensagens o valor da m�dia do aluno para qualquer condi��o.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Primeiro N�mero: ");
		int primeiraNota = sc.nextInt();
		System.out.println("Digite a Segunda Nota: ");
		int segundaNota = sc.nextInt();
		System.out.println("Digite a terceira Nota: ");
		int terceiraNota = sc.nextInt();
		System.out.println("Digite a quarta Nota: ");
		int quartaNota = sc.nextInt();
		int mediaNota = (primeiraNota + segundaNota+ terceiraNota + quartaNota) / 4;
		if (mediaNota >= 5) {
			System.out.println("Aluno Aprovado M�dia: " + mediaNota);
		} else {
			System.out.println("Aluno Reprovado M�dia: " + mediaNota);
		}
		sc.close();

	}

}
