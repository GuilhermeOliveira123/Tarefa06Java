package exercicio06tarefaflamingo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

/*01) Ler dois valores num�ricos inteiros e apresentar o resultado da diferen�a do maior pelo menor valor.
	  package exercicios06;*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Valor: ");
		int primeiroValor = sc.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		int segundoValor = sc.nextInt();
		if (primeiroValor > segundoValor) {
			System.out.println("A Diferen�a entre os numeros �: "+(primeiroValor-segundoValor));
		}else {
			System.out.println("A Diferen�a entre os numeros �: "+(segundoValor-primeiroValor));
		}
		
		sc.close();
		
	}

}
