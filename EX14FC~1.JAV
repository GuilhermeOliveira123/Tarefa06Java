package exercicio06tarefaflamingo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*05). Efetuar a leitura de tr�s valores(vari�veis A,B e C)e efetuar o c�lculo da equa��o completa de segundo grau,
		apresentando as duas ra�zes,se para os valores informados for poss�vel efetuar o referido c�lculo.
		Lembre-se de que a vari�vel A deve ser diferente de zero.*/
		
        Scanner scan = new Scanner(System.in);

        int valorA, valorB, valorC;

        System.out.println("Digite o valor da vari�vel A: ");
        valorA = scan.nextInt();

        System.out.println("Digite o valor da vari�vel B: ");
        valorB = scan.nextInt();

        System.out.println("Digite o valor da vari�vel C: ");
        valorC = scan.nextInt();

        if (valorA < valorB & valorB < valorC) {
            System.out
                    .println("Os n�meros ordenados em ordem crescente s�o: " + valorA + ", " + valorB + ", " + valorC);
        } else if (valorA < valorB & valorB > valorC & valorC > valorA) {
            System.out
                    .println("Os n�meros ordenados em ordem crescente s�o: " + valorA + ", " + valorC + ", " + valorB);
        } else if (valorA > valorB & valorB < valorC & valorA < valorC) {
            System.out
                    .println("Os n�meros ordenados em ordem crescente s�o: " + valorB + ", " + valorA + ", " + valorC);
        } else if (valorA < valorB & valorA > valorC) {
            System.out
                    .println("Os n�meros ordenados em ordem crescente s�o: " + valorC + ", " + valorA + ", " + valorB);
        } else if (valorB < valorA & valorC > valorB) {
            System.out
                    .println("Os n�meros ordenados em ordem crescente s�o: " + valorB + ", " + valorC + ", " + valorA);
        } else {
            System.out
                    .println("Os n�meros ordenados em ordem crescente s�o: " + valorC + ", " + valorB + ", " + valorA);
        }
        scan.close();

	}

}
