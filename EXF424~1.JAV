package exercicio06tarefaflamingo;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*11) Fa�a um algoritmo para ler: n�mero da conta do cliente,
		saldo, d�bito e cr�dito. Ap�s, calcular e escrever o saldo 
		atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar 
		]se saldo atual for maior ou igual a zero escrever a mensagem 
		'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.*/
		
		
		int numeroConta;
		float saldo, debitos, creditos, saldoAtual;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		numeroConta = sc.nextInt();
		System.out.println("Digite o saldo atual da conta: ");
		saldo = sc.nextFloat();
		System.out.println("Digite os d�bitos da conta: ");
		debitos = sc.nextFloat();
		System.out.println("Digite os creditos da connta: ");
		creditos = sc.nextFloat();
		
		saldoAtual = saldo - debitos + creditos;
		
		if (saldoAtual > 0) {
			System.out.println("Usu�rio: " +numeroConta+" Seu saldo � positivo: " + saldoAtual);
		} else if (saldoAtual == 0) {
			System.out.println("Usu�rio: " +numeroConta+" Seu saldo � nulo: " + saldoAtual);
		} else {
			System.out.println("Usu�rio: " +numeroConta+" Seu saldo � negativo: " + saldoAtual);
		}
		
		sc.close();

	}

}
