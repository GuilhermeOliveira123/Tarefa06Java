package exercicio06tarefaflamingo;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*02). Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o n�mero lido como sendo um 
		valor positivo, ou seja, o programa dever� apresentar o m�dulo de um n�mero fornecido. Lembre-se de verificar 
		se o n�mero fornecido � menor que zero; sendo, multiplique-o por -1.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Um N�mero: ");
		int numeroPositivo = sc.nextInt();
		if (numeroPositivo > 0) {
			System.out.println("O Valor Positivo �: " + numeroPositivo);
		} else {
			System.out.println("O Valor Positivo �: " + (numeroPositivo * -1));
		}
		
		sc.close();
	}

}
