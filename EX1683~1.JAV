package exercicio06tarefaflamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

/*10)Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. 
    Ap�s a leitura do valor fornecido pelo usu�rio, o programa dever� indicar uma de duas mensagens:
    "O valor est� na faixa permitida", caso o usu�rio forne�a o valor nesta faixa, ou a mensagem
    "O valor est� fora da faixa permitida", caso o usu�rio forne�a valores menores que 1 ou maiores que 9.
    
    */
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite aqui um n�mero: ");
        numero = scan.nextInt();

        if (numero < 1 || numero > 9) {
            System.out.println("O valor est� fora da faixa permitida");
        } else {
            System.out.println("O valor est� dentro da faixa permitida");
        }

        scan.close();

	}

}
