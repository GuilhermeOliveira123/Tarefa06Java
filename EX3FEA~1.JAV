package exercicio06tarefaflamingo;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		/*12)Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa,
		  apresentando com sa�da uma das seguintes mensagens:"Ilmo Sr.",se o sexo informado como masculino,
		  ou a mensagem"Ilma Sra.",para o sexo informado como feminino.
		  Apresente tamb�m junto da mensagem de sauda��o o nome previamente informado.
		 */
		

        String sexo;
        String nome;

        System.out.println("Informe o seu nome");
        nome = JOptionPane.showInputDialog("Informe o seu nome");

        System.out.println("Informe o sexo");
        sexo = JOptionPane.showInputDialog("Informe o sexo");

        if (sexo.equals("Masculino") || (sexo.equals("masculino"))) {
            System.out.println("Ilmo Sr " + nome);

        } else {
            if (sexo.equals("Feminino") || (sexo.equals("feminino"))) {
                System.out.println("Ilma Sra " + nome);

            } else {
                System.out.println("Sexo inv�lido!");
            }

            System.out.println("O seu nome � " + nome);
        }

	}

}
