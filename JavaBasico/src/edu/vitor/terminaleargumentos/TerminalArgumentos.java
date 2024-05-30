package edu.vitor.terminaleargumentos;

public class TerminalArgumentos {
	public static void main(String[] args) {

		// os argumentos começam com indice 0
		String nome = args[0];
		String sobrenome = args[1];
		int idade = Integer.valueOf(args[2]); // vamos falar sobre Wrappers
		double altura = Double.valueOf(args[3]);

		System.out.println("Ola, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos ");
		System.out.println("Minha altura é " + altura + "cm ");

		// Aqui vamos ver come executar um programa via terminal

		// Para executar vamos precisar localizar os arquivos .class geralmente é
		// armazenado na pasta bin

		// Argumentos

		// os argumentos começam com indice

	}
}
