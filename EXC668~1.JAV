package exercicio06tarefaflamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*09) Elaborar um programa que efetue a leitura de um n�mero inteiro e apresentar
	    uma mensagem informando se o n�mero � par ou �mpar.*/
		
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite aqui um n�mero qualquer: ");
        numero = scan.nextInt();

        if (numero % 2 == 1) {
            System.out.println("O n�mero digitado � �mpar!");
        } else {
            System.out.println("O n�mero digitado � par!");
        }

        scan.close();

	}

}
